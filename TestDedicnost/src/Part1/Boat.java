package Part1;

public class Boat extends Vehicle {
    private boolean isPlave;

    public Boat(int kapacita, int aktualniPalivo, String typPaliva, boolean isPlave) {
        super(kapacita, aktualniPalivo, typPaliva);
        this.isPlave = isPlave;
    }

    @Override
    public void move(){
        aktualniPalivo -= 1;
        System.out.println("Auto spalilo tolik paliva: " + 1);
    }
}
