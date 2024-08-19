package lesson013;

import lesson013.comparators.CarModelComparator;
import lesson013.comparators.CarPriceComparator;
import lesson013.model.Car;
import lesson013.model.Producer;

import java.util.Arrays;
import java.util.Comparator;

public class Main4 {
    public static void main(String[] args) {
        Producer[] producers = {
                new Producer("China", 1950),
                new Producer("USA", 1970),
                new Producer("China", 1930),
                new Producer("Germany", 1920)
        };

        Car[] cars = {
                new Car("Jeely", 15000, producers[0]),
                new Car("Mersedes", 30000, producers[3]),
                new Car("Haval", 20000, producers[2]),
                new Car("Jeely", 15000, producers[2]),
                new Car("Jeely", 14000, producers[2])
        };

        CarPriceComparator cpc = new CarPriceComparator();
        Arrays.sort(cars, cpc);

        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println("----------------------------");

        CarModelComparator cmc = new CarModelComparator();
        Arrays.sort(cars, cmc);

        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println("---------------------------------");

        //cpc.reversed() - метод на созданном компараторе который будет
        //полность противоречит его логике
        Arrays.sort(cars, cpc.reversed());

        for (Car car : cars) {
            System.out.println(car);
        }


        //Comparator<Car> cmp = new CarModelComparator().thenComparing(cpc);

    }
}
