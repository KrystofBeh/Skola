package Part3Znova;

public class Archer extends Unit {
    private String gun;

    public Archer(String name, int hp, String type, int attDamage, String gun) {
        super(name, hp, type, attDamage);
        this.gun = gun;
    }

}
