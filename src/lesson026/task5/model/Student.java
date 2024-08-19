package lesson026.task5.model;

import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Student>{
    private String name;
    private String surname;
    private Faculty faculty;
    private int course;
    private List<Integer> points;//в качесве поля класса может выступать коллекция

    public Student() {
        points = new ArrayList<>();
    }

    public Student(String name, String surname, Faculty faculty, int course, List<Integer> points) {
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
        this.points = new ArrayList<>(points);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<Integer> getPoints() {
        return points;
    }

    public void setPoints(List<Integer> points) {
        this.points = points;
    }

    public List<Double> returnListAvgPoint(Student student){
       List<Double> listAvgPoint  = new ArrayList<>();
       listAvgPoint.add(student.avgPoint());
       return listAvgPoint;
    }


    @Override
    public int compareTo(Student o) {
        int cmp = faculty.compareTo(o.faculty);
        if(cmp != 0){
            return cmp;
        }
        return Double.compare(avgPoint(),o.avgPoint());
    }


    public double avgPoint() {
        double avg = 0;
        for (Integer point : points) {
            avg += point;
        }
        avg /= points.size();
        return avg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", faculty=" + faculty +
                ", course=" + course +
                ", points=" + points +
                ", avgPoint=" + avgPoint()+
                '}';
    }
}
