import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        String inp = Files.readString(Path.of("diamonds.csv"));

        List<Diamond> diamonds = Arrays.stream(inp.split("\n"))
                .skip(1)
                .map(i -> i.replaceAll("\"", ""))
                .map(line -> line.split(","))
                .map(idk -> new Diamond(idk[0], idk[1], idk[2], idk[3], idk[4], idk[5], idk[6], idk[7], idk[8], idk[9], idk[10]))
                .toList();

        //33------------------------
        //Ukol 1 a)
        long countOfCut = diamonds.stream()
                .map(d -> d.cut)
                .filter(i -> i.equalsIgnoreCase("Fair"))
                .count();

        System.out.println("Number of Clarity: " + countOfCut);

        //Ukol 1 b)
        double pocet = 0;
        double cena = 0;
        List<Integer> prices = diamonds.stream()
                .filter(idk -> idk.cut.equalsIgnoreCase("Premium"))
                .map(d -> d.price)
                .toList();
        for  (Integer price : prices) {
            cena += price;
            pocet++;
        }
        double prumer = cena / pocet;
        int zaokrohleny = (int) Math.round(prumer / 10) * 10;
        System.out.println("Prumer: " + zaokrohleny);

        //67--------------------------

        //Ukol 2 a)
        diamonds.stream()
                .filter(d -> d.x == d.y)
                .forEach(i -> System.out.print(i.cut + ", " + i.color + ", " + i.price));


        System.out.println();


        //Ukol 2 b)
        List<String> hodnoty = diamonds.stream()
                .map(d -> d.cut)
                .distinct()
                .toList();

        System.out.println(Arrays.toString(hodnoty.toArray()));

        //100-----------------

        List<Diamond> fair = diamonds.stream()
                .filter(i -> i.cut.equalsIgnoreCase("Fair"))
                .toList();

        Collections.sort(fair.stream().map(i -> i.price).collect(Collectors.toList()));
        double sto = fair.getFirst().price;
        fair.stream()
                .forEach(i -> System.out.println(i.price / sto * 100));




    }
}