package lesson034.task3.model;

public class Employee {
    private String name;
    private String company;
    private Position position;
    private double salary;

    public Employee() {
    }

    public Employee(String name, String company, Position position, double salary) {
        this.name = name;
        this.company = company;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", company='").append(company).append('\'');
        sb.append(", position=").append(position);
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}
