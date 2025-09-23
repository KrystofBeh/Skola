public class Employe extends Human{
    private int hourlyRate;
    protected int clockedHours;

    public Employe(String name, int age, int hourlyRate) {
        super(name, age);
        this.hourlyRate = hourlyRate;
        this.clockedHours = 0;
    }

    public int getPaycheck(){
        System.out.println(getName() + " : " + hourlyRate*clockedHours + "kc");
        return hourlyRate*clockedHours;
    }

    public int getClockedHours() {
        return clockedHours;
    }

    public void setClockedHours(int clockedHours) {
        this.clockedHours = clockedHours;
    }
}