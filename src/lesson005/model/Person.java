package lesson005.model;

public class Person {
    //static поля хранятся metaspace в одном единственном экземпляре существуют
    //вне объектов и не привязаны к ним
    private static double tax = 0.13;//если поле может изменяться со временем
    public static final double TAX = 0.13;//если изменять не планируется
    private String name;
    private int age;
    private double salary;

    public Person() {
    }

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //для static полей - геттеры и сеттеры тоже static, для вызова не требуют объект
    //вызываются через имя класса
    public static double getTax() {
        return tax;
    }

    public static void setTax(double tax) {
        Person.tax = tax;
    }

    public void print() {
        System.out.println("Person: " + name + ", " + age + ", " + salary);
    }
}
