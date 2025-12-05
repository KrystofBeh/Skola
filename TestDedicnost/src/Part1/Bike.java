package Part1;

public class Bike extends Vehicle {
    private String jmeno;

    public Bike(int kapacita, int aktualniPalivo, String typPaliva, String jmeno) {
        super(kapacita, aktualniPalivo, typPaliva);
        this.jmeno = jmeno;
    }

    @Override
    public void move(){
        aktualniPalivo -= 5;
        System.out.println("Part1.Bike spalilo tolik paliva: " + 5);
    }

}
