package lesson031._03_counters;

import lesson031.model.Car;
import lesson031.model.Color;
import lesson031.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main2 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(List.of(
                new Car("BMW", Color.BLACK),
                new Car("Mersedes", Color.BLUE),
                new Car("BMW", Color.RED),
                new Car("Mazda", Color.BLACK)
        ));

        Color color = Color.BLACK;

        //лямбда проверяет на совпадение цвета маштны с черным цветом
        Countable<Car> lambda1 = car -> car.getColor().equals(color);

        System.out.println(lambda1.checkByField(new Car("Reno", Color.BLACK)));

        System.out.println("Черных машин в коллекции: " + CountersUtil.countByFieldGeneric(cars, lambda1));

        System.out.println("--------------------------------------------");

        List<Person> people = new ArrayList<>(List.of(
                new Person("Gosha", 45, 750),
                new Person("Igor", 25, 1000),
                new Person("Gosha", 20, 1100),
                new Person("Anya", 32, 450)
        ));

        //сколько имен в коллекции у объектов, у котрых больше 4 букв

        Countable<Person> lambda2 = person -> person.getName().length() > 4;
        System.out.println(CountersUtil.countByFieldGeneric(people, lambda2));
        
    }
}
