package Part3Znova;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Unit> units = new ArrayList<>();
        ArrayList<Unit> deadUnits = new ArrayList<>();

        units.add(new Warrior("Pepa", 50, "Warrior", 20, "Sword"));
        units.add(new Archer("Honza", 40, "Archer", 20, "Bow"));
        units.add(new Mage("Koleso", 25, "Mage", 25));
        units.add(new Warrior("Marek", 45, "Warrior", 10, "Sword"));
        units.add(new Archer("Kirill", 0, "Archer", 20, "Bow"));
        units.add(new Mage("Lukas", 50, "Mage", 25));


        for (Unit unit : units) {
            for (Unit u : units) {
                if (!unit.equals(u)){
                    unit.attack(u);
                    System.out.println("Zautocil");
                }
            }
        }

        for (Unit unit : units) {
            if (unit.isDead){
                deadUnits.add(unit);
                System.out.println("Umrel");
            }
        }
        units.removeAll(deadUnits);




    }


}
