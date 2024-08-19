package lesson019._04_linked_list;

import lesson019.model.Cat;
import lesson019.model.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //создана коллекция в которой можно работать с содержимым поэлементно поиндексно
        //под капотом здесь не массив, а двусвязный список
        LinkedList<Cat> list1 = new LinkedList<>();
        list1.add(new Cat("Murzik", 2));
        list1.add(new Cat("Wiskas", 3));
        list1.add(new Cat("Barsik", 5));

        System.out.println(list1.get(1));//обращение по индексу к элементу в LinkedList очень
        //громоздко, ведь индекс означает в скольких элемнтах нужно сначала побывать,
        //прежде чем попасть в нужный элемент

        //for (int i = 0; i < list1.size(); i++) {
        //  System.out.println(list1.get(i));
        //}

        //при работе с LinkedList можно использовать все методы котреы были рассмотрены
        //в пакете _03_array_list;

        System.out.println("----------------");
        Collections.sort(list1);
        System.out.println(list1);

        //найти кота максимального возраста
        System.out.println("----------");
        System.out.println(Collections.max(list1, new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.getAge() - o2.getAge();
            }
        }));


        List<Person> persons = new ArrayList<>();



    }
}
