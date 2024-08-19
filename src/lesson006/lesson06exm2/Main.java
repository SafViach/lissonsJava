package lesson006.lesson06exm2;

import lesson006.lesson06exm2.model.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Vasya", 20);
        Person[] people = {
                new Person("Valya", 45),
                new Person("Goga", 37),
                person1,
                new Person("Ira", 28)
        };

        for (Person person : people) {
            //person - ссылка, которая поочередно получит ссылку на каждый объект из массива people
            person.info();
        }

        people[0].greeting(people[1].getName());
        people[3].greeting(people[2].getName(), people[2].getAge());
        people[1].greeting(people[3]);

        Person person2 = new Person("Valera", 30);
        person2.greeting(people);
        System.out.println("------------");
        person2.greeting(people[0], person1, people[3]);

    }
}
