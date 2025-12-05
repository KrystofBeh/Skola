package Part1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Vehicle> list = new ArrayList<>();
        list.add(new Car(50,20, "Nafta", 4));
        list.add(new Bike(40,40, "Benzin", "Pepa"));
        list.add(new Plane(100,95, "LitaciPalivo", 1000));
        list.add(new Boat(20,5, "Neco", true));

        for (Vehicle v : list) {
            v.move();
        }


    }
}