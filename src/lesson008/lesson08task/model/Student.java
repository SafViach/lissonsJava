package lesson008.lesson08task.model;

//при наследование у абстрактного класса
public class Student extends Person {
    private static final double NORMAL_GRAND = 80;
    private double avg;
    private double parentsMoney;

    public Student() {
    }

    public Student(String name, double avg, double parentsMoney) {
        super(name);
        this.avg = avg;
        this.parentsMoney = parentsMoney;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public double getParentsMoney() {
        return parentsMoney;
    }

    public void setParentsMoney(double parentsMoney) {
        this.parentsMoney = parentsMoney;
    }

    //метод высчитывающий стипендию
    public double grand() {
        return avg >= 6 && avg < 8 ? NORMAL_GRAND : (avg >= 8 && avg <= 10 ? 150 : 0);
    }

    @Override
    public double monthlyIncome() {
        return parentsMoney + grand();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", avg=" + avg +
                ", parentsMoney=" + parentsMoney +
                ", grand=" + grand() +
                ", monthlyIncome=" + monthlyIncome() +
                '}';
    }
}
