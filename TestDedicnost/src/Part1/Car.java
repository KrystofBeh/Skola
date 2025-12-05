package Part1;

public class Car extends Vehicle {
    private int pocetKol;


    public Car(int kapacita, int aktualniPalivo, String typPaliva, int pocetKol) {
        super(kapacita, aktualniPalivo, typPaliva);
        this.pocetKol = pocetKol;
    }

    @Override
    public void move(){
        aktualniPalivo -= 10;
        System.out.println("Auto spalilo tolik paliva: " + 10);
    }
}
