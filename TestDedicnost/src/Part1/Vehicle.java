package Part1;

public class Vehicle {
    protected int kapacita;
    protected int aktualniPalivo;
    protected String typPaliva;

    public Vehicle(int kapacita, int aktualniPalivo, String typPaliva) {
        this.kapacita = kapacita;
        this.aktualniPalivo = aktualniPalivo;
        this.typPaliva = typPaliva;
    }

    public void move(){};
    public void refule(int dotankovani){};


}
