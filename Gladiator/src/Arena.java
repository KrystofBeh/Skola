
public class Arena {
    private Gladiator redTeam;
    private Gladiator blueTeam;

    public void simulateOneRound() {
        int blueUtok = (int)(Math.random() * (blueTeam.getMaxDamage() - blueTeam.getMinDamage()) + blueTeam.getMinDamage());
        int blueDefence = (int)(Math.random() * (blueTeam.getMaxDefence() - blueTeam.getMinDefence()) + blueTeam.getMinDefence());

        int redUtok = (int)(Math.random() * (redTeam.getMaxDamage() - redTeam.getMinDamage()) + redTeam.getMinDamage());
        int redDefence = (int)(Math.random() * (redTeam.getMaxDefence() - redTeam.getMinDefence()) + redTeam.getMinDefence());

        if (redUtok > blueDefence) {
            blueTeam.setHp(blueTeam.getHp() - (redUtok  - blueDefence));
            System.out.println("red ubral: " + (redUtok - blueDefence) + ", blue HP: " + blueTeam.getHp());
        }else {
            System.out.println("red missnul");
        }
        if (blueUtok > redDefence) {
            redTeam.setHp(redTeam.getHp() - (blueUtok  - redDefence));
            System.out.println("blue ubral: " + (blueUtok - redDefence) + ", red HP: " + redTeam.getHp());
        }else{
            System.out.println("blue missnul");
        }

        if (blueTeam.getHp() <= 0) {
            System.out.println("red vyhral");
        }
        if (redTeam.getHp() <= 0) {
            System.out.println("blue vyhral");
        }

    }

    public void simulateRounds(){
        while (true){
            simulateOneRound();
            if (blueTeam.getHp() <= 0) {
                break;
            }
            if (redTeam.getHp() <= 0) {
                break;
            }
        }

    }

    public void addRedTeam(Gladiator gladiator) {
        redTeam = gladiator;
    }

    public void addBlueTeam(Gladiator gladiator) {
        blueTeam = gladiator;
    }
}
