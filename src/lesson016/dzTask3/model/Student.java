package lesson016.dzTask3.model;

import lesson016.dzTask3.exseption.AvgBallNegativeException;
import lesson016.dzTask3.exseption.AvgNoOneToTenNegative;
import lesson016.dzTask3.exseption.NameLessTwoCharacters;
import lesson016.dzTask3.exseption.NullNameExseption;

public class Student {
    private String name;
    private double avgBall;

    public Student(String name, double avgBall)throws NullNameExseption,NameLessTwoCharacters,AvgBallNegativeException,AvgNoOneToTenNegative{
        if (name == null)throw new NullNameExseption();
        if (name.length()<=2)throw new NameLessTwoCharacters();
        if (avgBall<=0)throw new AvgBallNegativeException();
        if (avgBall<1||avgBall>10)throw new AvgNoOneToTenNegative();
        this.name = name;
        this.avgBall = avgBall;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws NullNameExseption,NameLessTwoCharacters,AvgBallNegativeException,AvgNoOneToTenNegative{
        if (name == null)throw new NullNameExseption();
        if (name.length()<=2)throw new NameLessTwoCharacters();
        if (avgBall<=0)throw new AvgBallNegativeException();
        if (avgBall<1||avgBall>10)throw new AvgNoOneToTenNegative();
        this.name = name;
    }

    public double getAvgBall() {
        return avgBall;
    }

    public void setAvgBall(double avgBall) {
        this.avgBall = avgBall;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", avgBall=" + avgBall +
                '}';
    }
}
