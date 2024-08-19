package lesson008.lesson08exm1;

import lesson008.lesson08exm1.model.Person;
import lesson008.lesson08exm1.model.Worker;

public class Main3 {
    public static void main(String[] args) {
        int x1 = 10;
        double y1 = 10.5;
        int x2 = (int)y1;//явное преобразование
        byte b1 = 5;
        int x3 = b1;//неявное преобразование

        //в Java можно хранить объект подкласса в ссылке суперкласса

        Person person1 = new Person("Ignat");
        Worker worker1 = new Worker("Vitya", 500);
        //person1 - доступны методы Object, Person
        //worker1 - доступны методы Object, Person, Worker
        Person person2 = worker1;//неявное преобразование (безопасное, не приводит к
        //ошибкам компиляции), upcast, восходящее преобразование типов
        //при таком подходе по ссылке person2 будут доступны для вызова методы
        //Object, Person хотя по ссылке хранится объект Worker

        System.out.println(person2);//toString() - версия из класcа Worker

        Object object1 = worker1;//в ссылке типа Object можно хранить адрес вообще
        //любого объекта Java
        System.out.println(object1);

        //Worker worker2 = person1;//ошибка!! попытка записи из ссылки суперкласса
        //в ссылку подкласса

        Worker worker3 = (Worker) person2;//чтобы избавится от такой ошибки необходимо
        //явно преобразовать (небезопасно), downcast нисходящее преобразовнаие типов
        System.out.println(worker3.getSalary());

        Worker worker4 = null;
        //instanceof - проверяет соотвествует ли объект по ссылке указанному классу

        if(person1 instanceof Worker){//если по ссылке person1 хранится объект Worker
            worker4 = (Worker) person1;//то явно преобразовываем
            System.out.println(worker4.getSalary());//и вызываем метод класса Worker
        }

        if(person2 instanceof Worker){
            System.out.println(((Worker) person2).getSalary());
        }



    }
}
