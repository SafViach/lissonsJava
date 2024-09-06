package lesson034_dz_streamApi.task03.model;

public class Employee {
    private String name;
    private String nameCompany;
    private Position position;
    private double salary;

    public Employee() {
    }

    public Employee(String name, String nameCompany, Position position, double salary) {
        this.name = name;
        this.nameCompany = nameCompany;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
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
        sb.append(", nameCompany='").append(nameCompany).append('\'');
        sb.append(", position=").append(position);
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}
