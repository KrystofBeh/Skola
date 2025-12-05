package Part3Znova;

abstract class Unit {
    protected String name;
    protected int hp;
    protected int attDamage;
    protected boolean isDead;
    protected String type;


    public Unit(String name, int hp, String type, int attDamage) {
        this.name = name;
        this.hp = hp;
        this.isDead = false;
    }

    public void attack(Unit target){
        target.takeDamage(this.attDamage);
    }

    public void takeDamage(int damage){
        this.hp -= damage;
        if (this.hp <= 0) {
            isDead = true;
        }
    }
}
