package lesson019._09_tree_set;

import lesson019.model.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Person> set1 = new TreeSet<>();

        set1.add(new Person("Igor", 500));
        set1.add(new Person("Vasya", 700));
        set1.add(new Person("Ira", 300));
        set1.add(new Person("Grisha", 450));

        for (Person person : set1) {
            System.out.println(person);
        }

        System.out.println("--------------------------");

        Set<Person> set2 = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        set2.add(new Person("Igor", 500));
        set2.add(new Person("Vasya", 700));
        set2.add(new Person("Ira", 300));
        set2.add(new Person("Grisha", 450));

        for (Person person : set2) {
            System.out.println(person);
        }
        ArrayList<Integer>alist1 = new ArrayList<>();
        LinkedList<Integer>lList1=new LinkedList<>();

    }
}
