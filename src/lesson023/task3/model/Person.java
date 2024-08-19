package lesson023.task3.model;

import java.io.*;

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
    //метод принимает путь к файлу , считает инфу Б создаст обьект и вернет инфу
    static public void savePersonToFile(Person person,String fileName){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName,true))){
            // bw.write(person.toString());
            // bw.write(person.getName()+" "+person.getSalary()+" "+person.getAge());
            bw.write(person.toFileLine());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
    public String toFileLine() {
        return name + " " + age + " " + salary;
    }
    static public Person loadPersonFromFile(String filename){

        Person person=null;

        try(BufferedReader br = new BufferedReader(new FileReader(filename))){

            String fileLine = br.readLine().trim();//"Grisha 42 510.32" и убрали пробелы в начале и конце

            String[] firlds = fileLine.split(" ");//["Grisha","42","510.32"]

            person = new Person(firlds[0],Integer.valueOf(firlds[1]),Double.valueOf(firlds[2]));

        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        return person;

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
