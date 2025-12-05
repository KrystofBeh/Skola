package Part2;

public class LaserPrinter extends Printer {

    public LaserPrinter(String name, int priceOfToner) {
        super(name, priceOfToner);
    }

    @Override
    public void print(String text){
        System.out.println(name + " vylejsrovala: " + text);
    }

    @Override
    public int getCostPerPage(){
        return priceOfToner * priceOfPage;
    }

}
