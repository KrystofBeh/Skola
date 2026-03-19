import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String inp = Files.readString(Path.of("diamonds.csv"));

        List<Diamond> diamonds = Arrays.stream(inp.split("\n"))
                .skip(1)
                .map(i -> i.replaceAll("\"", ""))
                .map(i -> i.split(","))
                .map(idk -> new Diamond(idk[0], idk[1], idk[2], idk[3], idk[4], idk[5], idk[6], idk[7], idk[8], idk[9], idk[10]))
                .toList();


        //1

        System.out.println(
                diamonds.stream()
                        .map(i -> i.cut)
                        .filter(i -> i.equals("Fair"))
                        .count()
        );

        double pocet = diamonds.stream()
                .map(i -> i.cut)
                .filter(i -> i.equals("Premium"))
                .count();

        double cena = diamonds.stream()
                .filter(i -> i.cut.equals("Premium"))
                .map(i -> i.price)
                .mapToDouble(i -> i)
                .sum();

        System.out.println(Math.round(cena / pocet / 10) * 10);

        //2

         diamonds.stream()
                .filter(i -> i.x == i.y)
                 .forEach(i -> System.out.println(i.cut + " " + i.color + " " + i.price));

         diamonds.stream()
                 .map(i -> i.cut)
                 .distinct()
                 .forEach(i -> System.out.println(i));


         //3

         List<Integer> price =
                 diamonds.stream()
                 .filter(i -> i.cut.equals("Fair"))
                 .map(i -> i.price)
                 .sorted(Comparator.reverseOrder())
                 .toList();

         double nej = (double) price.getFirst();

        price.stream()
                .forEach(i -> System.out.println(Math.round((i / nej * 100) * 100.0) / 100.0));



    }
}