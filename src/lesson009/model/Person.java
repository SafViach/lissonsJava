package lesson009.model;

public class Person {
    private String name;
    private int age;

    public Person() {
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

    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Person)) return false;
//
//        Person person = (Person) o;
//
//        if (age != person.age) return false;
//        return name.equals(person.name);
//    }

    //сравнит объект по ссылке this с объектом по ссылке object
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;//если две ссылки на один объект
        if (object == null) return false;//сравнение с null должно дать false
        if (getClass() != object.getClass()) return false;//если это объекты разных классов, то false

        Person person = (Person) object;//перекинули ссылку с object на person, чтобы были видны поля

        //name - поле класса String, в классе String уже есть свой метод equals, который умеет
        // сравнивать строки
        if (!this.name.equals(person.name)) return false;//если имена не одинаковы то false
        //if(this.salary != person.salary) return false;
        return this.age == person.age;

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();//Vasya
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
