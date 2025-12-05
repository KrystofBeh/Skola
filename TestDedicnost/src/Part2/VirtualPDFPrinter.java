package Part2;

public class VirtualPDFPrinter  extends Printer{

    public VirtualPDFPrinter(String name, int priceOfToner) {
        super(name, priceOfToner);
    }

    @Override
    public void print(String text){
        System.out.println(name + " napsala(vytiskla): " + text);
    }

    @Override
    public int getCostPerPage(){
        return 1;
    }

}
