package lesson023.task5.model;

public class Student extends Person{
    private double point;

    public Student(double point) {
        this.point = point;
    }

    public Student(String name, int age, double point) {
        super(name, age);
        this.point = point;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toFileLine() {
        return super.toFileLine() + " " + point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "point=" + point +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
