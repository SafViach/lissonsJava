package lesson023.task5.model;

public class Worker extends Person{
    private double salary;

    public Worker(double salary) {
        this.salary = salary;
    }

    public Worker(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toFileLine() {
        return super.toFileLine() + " " + salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "salary=" + salary +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
