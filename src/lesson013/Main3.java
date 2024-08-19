package lesson013;

import lesson013.model.Car;
import lesson013.model.Producer;
import lesson013.model.Truck;

import java.util.Arrays;
import java.util.Comparator;

public class Main3 {
    public static void main(String[] args) {
        Producer[] producers = {
                new Producer("China", 1950),
                new Producer("USA", 1970),
                new Producer("China", 1930),
                new Producer("Germany", 1920)
        };

        Truck[] trucks = {
                new Truck("Jeely", 15000, producers[0], 5000),
                new Truck("Mersedes", 30000, producers[3], 4500),
                new Truck("Haval", 20000, producers[2], 6000),
                new Truck("Jeely", 15000, producers[2], 7000),
                new Truck("Jeely", 14000, producers[2], 6500),
                new Truck("Jeely", 14000, producers[2], 6300)
        };

        Arrays.sort(trucks);

        for (Truck truck : trucks) {
            System.out.println(truck);
        }

        System.out.println("-----------------------------");
        //создаст объект который полность противоречит алгоритму естественного порядка
        //сортировки compareTo
        Arrays.sort(trucks, Comparator.reverseOrder());
        for (Truck truck : trucks) {
            System.out.println(truck);
        }

    }
}
