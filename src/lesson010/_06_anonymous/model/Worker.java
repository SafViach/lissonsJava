package lesson010._06_anonymous.model;

public class Worker {
    private String name;
    private double salary;//оклад

    public Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public double generalSalary() {
        return salary * 2;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", generalSalary=" + generalSalary() +
                '}';
    }
}
