package lesson013.comparators;

import lesson013.model.Car;

import java.util.Comparator;

public class CarPriceComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        return Double.compare(car1.getPrice(), car2.getPrice());
    }
}
