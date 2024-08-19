package lesson008.lesson08task.model;

//аьстрактный класс - класс содержащий хотя бы один
//абстрактный метод
//такие классы не могут создавать объекты
public abstract class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //абстрактный метод - метод без реализации
    //у каждого человека есть доход но он связан с конкретной соц группой
    //для понятия просто человек доход - понятие абстрактное, нет формулы для
    //расчета
    public abstract double monthlyIncome();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
