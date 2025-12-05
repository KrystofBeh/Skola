package Part2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Printer> list = new ArrayList<>();
        list.add(new LaserPrinter("LaserPrinter", 500));
        list.add(new InjektPrinter("InjektPrinter", 200));
        list.add(new VirtualPDFPrinter("PDFPrinter", 0));

        for (Printer printer : list) {
            printer.print("LoremIpsum");
            printer.getCostPerPage();
        }


    }
}
