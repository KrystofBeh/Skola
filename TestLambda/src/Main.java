import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> pole = new ArrayList<>();
        //pole.add(-15);
        for (int i = 1; i <= 10; i++) {
            pole.add(i);
        }
        pole.add(-2);
        ArrayWrapper numbers = new ArrayWrapper(pole);


        int p = numbers.pocet((i) -> i % 2 == 0);
        System.out.println(p);

        int neco = numbers.maxBy((i) -> Math.abs(i));
        System.out.println(neco);

        ArrayList<Integer> idk = numbers.whileIdk((i) -> i > 0);
        System.out.println(Arrays.toString(idk.toArray()));


    }

}