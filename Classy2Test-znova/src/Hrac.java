import java.util.ArrayList;

public class Hrac {
    private String jmeno;
    private Modul pozice;
    private ArrayList<Predmet> invetar = new ArrayList<>();

    public Hrac(String jmeno, Modul pozice) {
        this.jmeno = jmeno;
        this.pozice = pozice;
    }

    public Modul getPozice() {
        return pozice;
    }

    public void setPozice(Modul pozice) {
        this.pozice = pozice;
    }

    public void addPredmet(Predmet p) {
        invetar.add(p);
    }

    public ArrayList<Predmet> getInvetar() {
        return invetar;
    }


}
