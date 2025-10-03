import java.util.ArrayList;

public class Clovek {
    private String jmeno;
    private String prijmeni;
    private int vek;
    private String pohlavi;
    private ArrayList<Clovek> sourozenci = new ArrayList<>();

    public Clovek(String jmeno, String prijmeni, int vek, String pohlavi) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.pohlavi = pohlavi;
    }

    public void addSourozenec(Clovek clovek){
        for (Clovek c : sourozenci) {
            c.addSourozenec(clovek);
            clovek.bylPridan(c);
        }
        sourozenci.add(clovek);
        clovek.bylPridan(this);
    }

    private void bylPridan(Clovek clovek){
        sourozenci.add(clovek);
    }

    public int getPocetSourozencu(){
        return sourozenci.size();
    }

}
