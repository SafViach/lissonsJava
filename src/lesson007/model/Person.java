package lesson007.model;

//суперкласс(базовый, родительский) - от которого наследуют
//если класс не наследует ни от какого класса, то он наследует от
//класса Object
public class Person {
    private String name;
    private int age;

    public Person() {
        this("none", -1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void info() {
        System.out.println("Person: " + name + ", " + age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
