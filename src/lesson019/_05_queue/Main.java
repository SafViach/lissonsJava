package lesson019._05_queue;

import lesson019.model.Person;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        //Queue - используют для добавления и изъятия элементов из стека или
        //очереди
        //нет поиндексного обращения
        //порядок перебора может не соотвествовать порядку добавления


        //использование  ArrayDeque для организации стека
        ArrayDeque<Person> stack1 = new ArrayDeque<>();
        //добавление в стек
        stack1.push(new Person("Igor", 500));
        stack1.push(new Person("Vasya", 700));
        stack1.push(new Person("Ira", 300));
        stack1.push(new Person("Grisha", 450));

        for (Person person : stack1) {
            System.out.println(person);
        }
        //pop - удалит последний добавленный элемент в стек и вернет его
        //Person person1 = stack1.pop();
        System.out.println("Изымаем элемент из стека " + stack1.pop());

        stack1.push(new Person("Misha", 1000));
        stack1.push(new Person("Vitya", 850));

        System.out.println("-----------------");
        //возвращет true если коллеция пуста
        //пока стек не пустой
        while (!stack1.isEmpty()){
            System.out.println("Изымаем элемент из стека " + stack1.pop());
        }

    }
}
