package lesson010._01_aggregation.model;

public class Person {
    private String name;
    private Flat regFlat;

    public Person() {
    }

    public Person(String name, Flat regFlat) {
        this.name = name;
        this.regFlat = regFlat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flat getRegFlat() {
        return regFlat;
    }

    public void setRegFlat(Flat regFlat) {
        this.regFlat = regFlat;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", regFlat=" + regFlat +
                '}';
    }
}
