package Praktica001.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Person {
    private String name;
    private int age;
    private double salary;

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public static Person loadPersonFromFile(String nameFile){
        Person person = null;
        try(BufferedReader br = new BufferedReader(new FileReader(nameFile))) {
            String lineFile = br.readLine().trim();
            String[] arrStringLine = lineFile.split(" ");
            String name = arrStringLine[0];
            int age = Integer.valueOf(arrStringLine[1]);
            double salary = Double.valueOf(arrStringLine[2]);
            person = new Person(name,age,salary);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return person;
    }

    public String printToFail(){
        return name + " " + age + " " +salary;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
