package lesson008.lesson08exm1;

import lesson008.lesson08exm1.model.Person;
import lesson008.lesson08exm1.model.Worker;

public class Main4 {
    public static void main(String[] args) {

        //Массив типа Person позволит хранить адреса объектов Person и Worker


        Person[] people = new Person[5];
        people[0] = new Person("Galya");
        people[1] = new Worker("Misha", 500);
        people[2] = new Worker("Petya", 550);
        people[3] = new Person("Ignat");
        people[4] = new Person("Igor");

        //если у нас работа происходит со множеством разных объектов одной иерархии
        //можно создать один массив базового класса и хранить там любые объекты
        //этой иерархии

        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println("Зрплаты тех, кто работник");
        for (Person person : people) {
            if(person instanceof Worker){
                System.out.println(((Worker) person).getSalary());
            }
        }

    }
}
