package lesson008.lesson08task.model;

public class Emploee extends Person {
    private static double tax = 0.13;
    private double salary;

    public Emploee() {
    }

    public Emploee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public static double getTax() {
        return tax;
    }

    public static void setTax(double tax) {
        Emploee.tax = tax;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double monthlyIncome() {
        double result = 0;
        result = salary - salary * tax;
        return result;
    }

    @Override
    public String toString() {
        return "Emploee{" +
                "name='" + getName() + '\'' +
                ", salary=" + salary +
                ", monthlyIncome=" + monthlyIncome() +

                '}';
    }
}
