package dzLesson020byCollections.model;

import dzLesson020byCollections.model.model.Person;

import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Person person1 = new Person("Slava",27,5000);
        Person person2 = new Person("Petia",25,1000);
        Person person3 = new Person("Nastia",21,2500);
        Person person4 = new Person("Gena",34,500);
        Person person5 = new Person("Gena",35,600);
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        for (Person person : people) {
            System.out.println(person);
        }

        Collections.sort(people);

        System.out.println("сортированная коллекция");
        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println("подколлекция тех кто зарабатывает выше среднего");

        double avarageSalary = 0;
        double sumSalary = 0;
        for (int i = 0; i < people.size(); i++) {
            sumSalary = sumSalary + people.get(i).getSalary();
        }
        avarageSalary = sumSalary / people.size();
        System.out.println("среднее среди всех " + avarageSalary);

        List<Person> people2 = new ArrayList<>();
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getSalary()>avarageSalary)
                people2.add(people.get(i));
        }
        for (Person person : people2) {
            System.out.println(person);
        }
        System.out.println("второй способ");



        Collections.sort(people,new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                return Double.compare(o1.getSalary(),o2.getSalary());
            }
        });
        System.out.println("новая сортировка");
        for (Person person : people) {
            System.out.println(person);
        }

        int startIndex= 0;
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getSalary()>avarageSalary){
                startIndex = i;
            break;
            }

        }
        System.out.println("-------------------------------------------");
        people2 = people.subList(startIndex,people.size());
        for (Person person : people2) {
            System.out.println(person);
        }
        System.out.println("создаю подколлекцию тех кому больше 30-ти");
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()- o2.getAge();
            }
        });
        System.out.println("новая сортировка по возрасту");
        for (Person person : people) {
            System.out.println(person);
        }
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getAge()>=30){
                startIndex = i;
                break;
            }
        }
        System.out.println("всем кому за 30");
        List<Person> moreThanThirty = new ArrayList<>();
        moreThanThirty = people.subList(startIndex,people.size());
        for (Person person : moreThanThirty) {
            System.out.println(person);
        }
        System.out.println("Удалить из основной коллекции всех людей, зарабатывающих меньше 500");
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getSalary()<=500)
                people.remove(i);
        }
        for (Person person : people) {
            System.out.println(person);
        }

    }
}
