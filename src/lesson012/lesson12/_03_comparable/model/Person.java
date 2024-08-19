package lesson012.lesson12._03_comparable.model;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private double salary;

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    //метод естественного порядка сортировки (natural order)
    @Override
    public int compareTo(Person person) {
        int cmp = name.compareTo(person.name);
        if (cmp != 0)//если имена не одинаковы
            return cmp;//то данные объекты сортируем по именам
        cmp = age - person.age;
        if (cmp != 0)//если возраста не одинаковы
            return cmp;//то при одинаковых именах смотрим на возраста
        return Double.compare(salary, person.salary);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
