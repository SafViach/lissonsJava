package lesson019._05_queue;

import lesson019.model.Person;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Main2 {
    public static void main(String[] args) {
        //использование  ArrayDeque для организации очереди
        Queue<Person> queue1 = new LinkedList<>();

        //offer - поместить в очередь
        queue1.offer(new Person("Igor", 500));
        queue1.offer(new Person("Vasya", 700));
        queue1.offer(new Person("Ira", 300));
        queue1.offer(new Person("Grisha", 450));

        for (Person person : queue1) {
            System.out.println(person);
        }

        System.out.println("Изымамем элемент из очереди " + queue1.poll());

        System.out.println("---------");
        queue1.offer(new Person("Misha", 1000));
        queue1.offer(new Person("Vitya", 850));

        while (!queue1.isEmpty()){
            System.out.println("Изымамем элемент из очереди " + queue1.poll());
        }

    }
}
