public class Main {
    public static void main(String[] args) {
        Manager manager = Manager.getInstance();

        manager.addPerson(new Employe("Marek", 19, 121));
        manager.addPerson(new Employe("Kirill", 50, 200));

        mesicPrace(manager);
    }

    public static void mesicPrace(Manager manager) {
        for(int i = 0; i <30; i++){
            manager.workDay();
        }
    }
}