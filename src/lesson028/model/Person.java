package lesson028.model;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate age;
    private double salary;

    public Person(String name, LocalDate age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}
