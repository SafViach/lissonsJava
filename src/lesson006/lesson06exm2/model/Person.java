package lesson006.lesson06exm2.model;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void info() {
        System.out.println("Person: " + name + ", " + age);
    }


    //перегрузка методов - возможность создания в одном классе нескольких методов
    //с одинаковым именем но уникальным списком параметров
    //у перегруженных методов может быть разный возвращаемый тип
    //у перегруженных методов могут быть различные модифакторы доступа


    //this.name - поле объекта, для которого вызван метод
    //name - переменая которая пришла в качкестве параметра в метод
    public void greeting(String name) {
        System.out.println(this.name + ": hi " + name);
    }

    public void greeting(String name, int age) {
        System.out.println(this.name + ": hi " + name + " with age " + age);
    }

    public void greeting(Person person) {//для вызова метода потребуется объект Person
        //this - ссылка на объект для которого вызван метод(кто здоровается)
        //person - ссылка на объект, который передали в метод(с кем здороваются)
        System.out.println(this.name + ": hi " + person.name + " with age " + person.age);
    }

    //данный метод принимает ссылку на массив объектов Person
//    public void greeting(Person[] arr) {
//        System.out.println(name + " hi people:");
//        for (Person person : arr) {
//            System.out.println(person.getName());
//        }
//    }

    //метод с переменным количеством аргументов
    //данный метод можно вызывать отправив в него одного, двух, трех и т.д. людей или
    //сразу масссив
    public void greeting(Person ... arr){
        System.out.println(name + " hi people:");
        for (Person person : arr) {
            System.out.println(person.getName());
        }
    }

}
