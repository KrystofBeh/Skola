package Part2;

abstract class Printer {
    protected String name;
    protected int priceOfToner;
    protected int priceOfPage = 0;

    public Printer(String name, int priceOfToner) {
        this.name = name;
        this.priceOfToner = priceOfToner;
        this.priceOfPage = 10;
    }

    abstract public void print(String text);
    abstract public int getCostPerPage();



}
