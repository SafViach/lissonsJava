package lesson013;

import lesson013.model.Car;
import lesson013.model.Producer;

public class Main7 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car1 = new Car("Mersedes", 30000,
                                        new Producer("Germany", 1950));
        Car car2 = new Car(car1);

        Car car3 = (Car)car1.clone();
    }
}
