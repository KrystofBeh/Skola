package Part2;

public class InjektPrinter extends LaserPrinter {

    public InjektPrinter(String name, int priceOfToner) {
        super(name, priceOfToner);
    }

    @Override
    public void print(String text){
        System.out.println(name + " vytiskla: " + text);
    }

    @Override
    public int getCostPerPage(){
        return priceOfToner * priceOfPage + 20;
    }
}
