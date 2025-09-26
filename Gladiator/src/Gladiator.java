public class Gladiator {
    private String name;
    private int hp;

    private int minDamage;
    private int maxDamage;
    private int minDefence;
    private int maxDefence;

    public Gladiator(String name, int hp, int minDamage, int maxDamage, int minDefence, int maxDefence) {
        this.name = name;
        this.hp = hp;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.minDefence = minDefence;
        this.maxDefence = maxDefence;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public int getMinDefence() {
        return minDefence;
    }

    public int getMaxDefence() {
        return maxDefence;
    }

    public int getHp(){
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }


}
