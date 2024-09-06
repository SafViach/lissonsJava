package lesson029_date._04.model;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private LocalDate birthday;

    public Person() {
    }

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getAge(){
        LocalDate dateNow = LocalDate.now();
        Period period = Period.between(birthday, dateNow);
        return period.getYears();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", birthday=").append(birthday);
        sb.append('}');
        return sb.toString();
    }
}
