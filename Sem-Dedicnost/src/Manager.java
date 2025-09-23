import java.util.ArrayList;

public class Manager {
    private static Manager instance;
    public static Manager getInstance() {
        if(instance == null) {
            instance = new Manager();
        }
        return instance;
    }

    private ArrayList<Employe> employes;
    private int day;

    public void addPerson(Employe employe){
        employes.add(employe);
    }

    public void workDay(){
        day++;
        for(Employe employe : employes){
            employe.setClockedHours( 8 + employe.getClockedHours());
            if(day==30){
                employe.getPaycheck();
                employe.setClockedHours(0);
            }
        }
        if(day==30){
            day=0;
        }
    }

    private Manager() {
        employes = new ArrayList<>();
        day = 0;
    }

}
