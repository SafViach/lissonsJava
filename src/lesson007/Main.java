package lesson007;

import lesson007.model.Person;
import lesson007.model.Student;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ivan", 45);
        person1.info();
        Student student1 = new Student("Igor", 20, "GSU", 2);
        student1.info();
        //student1 по ссылке подкласса доступен вызов методов подкласса и суперкласса
        System.out.println("-----------");
        //Метод класса Object toString() - представление объекта
        //в виде строки
        System.out.println(person1.toString());
        System.out.println(student1.toString());
        System.out.println("------------------");
        System.out.println(person1);//при выводе информации об объекте можно указывать просто ссылку
        System.out.println(student1);//метод toString будет вызван автоматически
    }
}
