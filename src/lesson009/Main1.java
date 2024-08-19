package lesson009;

import lesson009.model.Person;
import lesson009.model.Student;

public class Main1 {
    public static void main(String[] args) {
        Person person1 = new Person("Vasya", 20);
        //getClass -  метод Object
        //возвращает информацию о классе, на основании которого был создан
        //объект

        System.out.println(person1.getClass().getSimpleName());
        Class clazz = person1.getClass();//в отдельную переменную-ссылку
        //записали информацию о классе, на основе которого был создан person1

        //используя метод getClass() пожно получить доступ к механизмам рефлекии(менять закрытые поля,
        // вызывать закрытые методы, получать информацию обо всех полях и методах)

        Person person2 = new Person("Grisha", 78);

        //можно понять являются ли объекты по ссылкам объектами одного класса
        if (person1.getClass() == person2.getClass()) {
            System.out.println("Являются!");
        }

        Person person3 = new Student("Misha", 45, 9);

        System.out.println(person1.getClass() == person3.getClass());//Person == Student

        if(person3 instanceof Student){
            System.out.println("По ссылке person3 находится объект, который соответсвует типу Student");
        }

        if(person3 instanceof Person){
            System.out.println("По ссылке person3 находится объект, который соответсвует типу Person");
        }

        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
        System.out.println(person1.equals(person1));

    }
}
