package lesson016.dzTask2.model;

public class Pet {
    private String name;
    private int year;

    public Pet() {
    }

    public Pet(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
