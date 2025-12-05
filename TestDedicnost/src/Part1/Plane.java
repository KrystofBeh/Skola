package Part1;

public class Plane extends Vehicle {
    private int pocetPasazeru;

    public Plane(int kapacita, int aktualniPalivo, String typPaliva, int pocetPasazeru) {
        super(kapacita, aktualniPalivo, typPaliva);
        this.pocetPasazeru = pocetPasazeru;
    }

    @Override
    public void move(){
        aktualniPalivo -= 20;
        System.out.println("Letadlo spalilo tolik paliva: " + 20);
    }

}
