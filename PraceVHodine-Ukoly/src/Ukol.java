public class Ukol {
    private String jmeno;
    private String popisek;
    private String autor;
    private String resitel;
    private boolean isHotovy = false;

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setPopisek(String popisek) {
        this.popisek = popisek;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setResitel(String resitel) {
        this.resitel = resitel;
    }

    public String getJmeno() {
        return jmeno;
    }

    @Override
    public String toString() {
        return "Jmeno ukolu: " + jmeno + ", popisek: " + popisek + ", autor: " + autor + ", resitel: " + resitel + ".";
    }

}
