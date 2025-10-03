import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Clovek> lidi = new ArrayList<>();

        Clovek karel = new Clovek("Karel", "Dobry", 17, "Muz");
        Clovek jana = new Clovek("Jana", "Bohdalova", 15, "Zena");
        Clovek kirill = new Clovek("Kirill", "Hrdlicka", 12, "Muz");
        Clovek jan = new Clovek("Jan", "Petr", 21, "Muz");
        Clovek marek = new Clovek("Marek", "Kokos", 19, "Muz");

        lidi.add(karel);
        lidi.add(jana);
        lidi.add(kirill);
        lidi.add(jan);
        lidi.add(marek);

        karel.addSourozenec(jana);
        karel.addSourozenec(kirill);
        jan.addSourozenec(marek);

        for (Clovek c : lidi) {
            System.out.println(c.getPocetSourozencu());
        }

    }
}