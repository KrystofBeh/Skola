import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Modul obyvak = new  Modul("Obyvak");
        Modul kuchyn = new  Modul("Kuchyn");
        Modul precin = new  Modul("Precin");
        Modul zachod = new  Modul("Zachod");

        Hrac hrac = new Hrac("Pepa", obyvak);

        obyvak.addPropojeni(precin);
        obyvak.addPropojeni(kuchyn);
        precin.addPropojeni(zachod);
        kuchyn.addPropojeni(zachod);

        obyvak.addPredmet(new Predmet("Pohovka"));
        obyvak.addPredmet(new Predmet("Zidle"));
        precin.addPredmet(new Predmet("Bota"));
        kuchyn.addPredmet(new Predmet("Parek"));
        kuchyn.addPredmet(new Predmet("Vajicko"));
        zachod.addPredmet(new Predmet("Toaletak"));


        String line = "";
        do{
            System.out.println("Nachazis se v: " + hrac.getPozice().getJmeno());
            System.out.print("Tvuj inventar: ");
            for (Predmet p : hrac.getInvetar()){
                System.out.print(p.getJmeno() + ", ");
            }
            System.out.println();
            System.out.print("Z modulu muzes jit do: ");
            for (Modul m : hrac.getPozice().getPropojeni()){
                System.out.print(m.getJmeno() + ", ");
            }
            System.out.println();
            System.out.print("Na podlaze vidis: ");
            for (Predmet p : hrac.getPozice().getPredmety()){
                System.out.print(p.getJmeno() + ", ");
            }
            System.out.println();


            System.out.println("Pro prechod napis 'jdi jmenoModulu' pro sebrani napis 'seber jmenoPredmetu' pro ukonceni programu napis 'exit'");
            line = sc.nextLine().trim();
            String ukol = "";
            String predmetUkolu = "";
            if (line.contains(" ")){
                ukol = line.split(" ")[0];
                predmetUkolu= line.split(" ")[1];
            }


            if (ukol.equalsIgnoreCase("jdi")){
                for (Modul modul : hrac.getPozice().getPropojeni()){
                    if (modul.getJmeno().equalsIgnoreCase(predmetUkolu)){
                        hrac.setPozice(modul);
                        System.out.println("Presel si do: " + modul.getJmeno());
                    }
                }
            } else if (ukol.equalsIgnoreCase("seber")) {
                Predmet odstranit = new Predmet("Odstranit");
                for (Predmet p : hrac.getPozice().getPredmety()){
                    if (p.getJmeno().equalsIgnoreCase(predmetUkolu)){
                        odstranit =  p;
                        hrac.addPredmet(p);
                        System.out.println("Sebral si: " + p.getJmeno());
                    }
                }
                if (!odstranit.getJmeno().equals("Odstranit")){
                    hrac.getPozice().removePredmet(odstranit);
                }
            }


        }
        while(!line.equalsIgnoreCase("exit"));

    }
}
