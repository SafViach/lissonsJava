package lesson009.model;

public class Student extends Person {
    private int hours;

    public Student() {
    }

    public Student(String name, int age, int hours) {
        super(name, age);
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", hours=" + hours +
                '}';
    }

    @Override
    public void finalize() throws Throwable {
        System.out.println("!!!!!");
    }
}
