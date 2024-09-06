package lesson032._02_predicate;

import lesson032.model.Cat;
import lesson032.model.Color;
import lesson032.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main1 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(List.of(
                new Person("Misha",30,570),
                new Person("Grisha",15,1500),
                new Person("Masha",29,340),
                new Person("Anya",45,840),
                new Person("Nika",55,480)
        ));
        List<Cat> cats = new ArrayList<>(List.of(
                new Cat("Murzik", Color.BLACK,5),
                new Cat("Barsik", Color.GRAY,2),
                new Cat("Marsik", Color.COLOURFUL,3),
                new Cat("Zhuzha", Color.BLACK,4),
                new Cat("Belok", Color.WHILE,2)
        ));
        System.out.println("-------------действительно ли первому элементу коллекции людей 30 лет по старинке------------------");
        if (people.get(0).getAge()==30){
            System.out.println("yeas");
        }

        Predicate<Person> predicate1 = (person -> person.getAge()==30); // переопределили метод test
        if (predicate1.test(people.get(0))){
            System.out.println("yeas");
        }

        System.out.println("----------больше ли вес первого кота 3-х киллограмм--------");
        //переменные которые учавствуют в коде лямбд должны быть final
        double weight = 3; // лучше final
        //weight = 7; нельзя менять
        Predicate<Cat> predicate2 = cat -> cat.getWeight()>=weight;
        //weight = 7; нельзя менять
        if (predicate2.test(cats.get(0))){
            System.out.println("yeas");
        }
        System.out.println("----------практикуемся  вывести сколько маш а коллекции");
        System.out.println(Main1.countColObject(people,person -> person.getName()=="Masha"));

    }
    public static <T>int countColObject(List<T>list , Predicate<T> predicate){
        int count = 0;
        for (T object : list) {
            if (predicate.test(object)){
                count++;
            }
        }
        return count;
    }
}
