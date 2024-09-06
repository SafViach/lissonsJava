package lesson034_dz_streamApi.task02.model;

import java.time.LocalDate;
import java.time.Period;

// добавлю дату
public class Person {
    private String password;
    private String name;
    private int age;
    private LocalDate birthday;
    private double salary;

    public Person(String password, String name,  double salary, LocalDate birthday) {
        this.password = password;
        this.name = name;
        this.salary = salary;
        this.birthday=birthday;
        this.age = calgAge();
    }
    private int calgAge(){
        LocalDate nowDate = LocalDate.now();
        int age = 0;
        if (birthday!=null) {
            age = Period.between(birthday, nowDate).getYears();
            return age;
        }else return 0;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("password='").append(password).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", salary=").append(salary);
        sb.append(",birthday=").append(birthday);
        sb.append('}');
        return sb.toString();
    }
}
