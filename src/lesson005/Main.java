package lesson005;

import lesson005.model.Cat;
import lesson005.model.Dog;
import lesson005.model.Person;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = null;
        new Cat();//объект создан, но потярян в области heap, чтобы не потерять объект и дальше
        //с ним работать нам необходимо адрес объекта записать в ссылку
        Cat cat2 = new Cat();
        //работа с содержимым(констекстом) объекта осуществеляется  через ссылку ссылка.
        System.out.println(cat2.nickname);//видно только поле nickname (public)
        cat2.nickname = "Murzik";
        System.out.println(cat2.nickname);
        //System.out.println(cat1.nickname); NullPointerException когда по ссылке нет объекта
        cat1 = cat2;//теперь обе ссылки ссылаются на один и тот же объект

        //открытые поля - удобно, но не безопасно. Другие разработчики, которые не писали этот
        //класс, а используют его могут задать неверные по логике значения полям
        //поля класса как правило описываются как private

        System.out.println("---------------------------------------");

        //сработает конструктор по умолчанию
        Dog dog1 = new Dog();//создался объект класса, адрес его записан в ссылку dog1

        System.out.println(dog1.getName());
        System.out.println(dog1.getAge());

        //при помощи сеттеров изменяем значения полей объекта
        dog1.setName("Rex");
        dog1.setAge(5);

        System.out.println(dog1.getName());
        System.out.println(dog1.getAge());

        dog1.setName("X");
        dog1.setAge(-25);

        System.out.println(dog1.getName());
        System.out.println(dog1.getAge());

        dog1.print();

        System.out.println("--------------------------------------------------");

        Dog dog2 = new Dog("Zhuzha", 1);
        dog2.print();

        Dog dog3 = new Dog("Fenix");
        dog3.print();
        dog3.setAge(3);
        dog3.print();

        System.out.println("-----------------");
        Person person1 = new Person("Igor", 45, 500);
        person1.print();
        //к static полям класа обращаемся через имя класса
        System.out.println(Person.TAX);
        System.out.println(Person.getTax());
        Person.setTax(0.14);//изменение значения static поля через сеттер
        System.out.println(Person.getTax());


    }
}
