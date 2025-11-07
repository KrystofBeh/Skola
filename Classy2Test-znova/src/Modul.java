import java.util.ArrayList;

public class Modul {
    private String jmeno;
    private ArrayList<Modul> propojeni = new ArrayList<>();
    private ArrayList<Predmet> predmety = new ArrayList<>();

    public Modul(String jmeno) {
        this.jmeno = jmeno;
    }

    public void addPropojeni(Modul modul) {
        if (!propojeni.contains(modul)) {
            propojeni.add(modul);
        }
        if (!modul.getPropojeni().contains(this)) {
            modul.addPropojeni(this);
        }
    }

    public void addPredmet(Predmet predmet) {
        predmety.add(predmet);
    }

    public String getJmeno() {
        return jmeno;
    }

    public ArrayList<Modul> getPropojeni() {
        return propojeni;
    }

    public ArrayList<Predmet> getPredmety() {
        return predmety;
    }

    public void removePredmet(Predmet predmet){
        predmety.remove(predmet);
    }
}
