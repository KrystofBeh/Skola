public class Main {
    public static void main(String[] args) {
        Arena arena = new Arena();

        arena.addRedTeam(new Gladiator("Prokop", 100, 0,25, 0, 10));
        arena.addBlueTeam(new Gladiator("Ondrej", 95, 0,20, 5, 15));

        arena.simulateRounds();
    }
}