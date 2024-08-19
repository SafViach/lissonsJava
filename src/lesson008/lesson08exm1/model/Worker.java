package lesson008.lesson08exm1.model;

public class Worker extends Person{
    private double salary;

    public Worker() {
    }

    public Worker(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + getName() + '\'' +
                ", salary=" + salary +
                '}';
    }
}
