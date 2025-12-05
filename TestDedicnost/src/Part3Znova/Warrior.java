package Part3Znova;

public class Warrior extends Unit {
    private String gun;

    public Warrior(String name, int hp, String type, int attDamage, String gun) {
        super(name, hp, type, attDamage);
        this.gun = gun;
    }

}
