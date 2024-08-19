package lesson007.model;
//наследование - создать класс на основе уже существующего,
//для получения полей и методов подкласса

//класс студент будет создан на основе класса человек
//каждый студент также является и человеком, поэтому можно наследовать
//Student is a Person

//подкласс() - класс который наследует
public class Student extends Person {//один класс может напрямую наследовать
    //только у одного класса (множественное наследование запрещено)
    //name age - унаследованы
    private String univer;
    private int course;

    public Student() {
        //super();//вызов конструктора по умолчанию подкаласса//можно явно не прописывать
        //если в конструкторе подкласса явно не прозвести вызов конструктора суперкласса
        //то автоматически будет вызван конструктор по умолчанию
        this("none", 0, "none", -1);//при таком вызове super уже явно
        // не вызывается
        //можно явно прописать только либо this() либо super()
        //univer = "none";
        //course = -1;
    }

    //super() - вызов конструктора подкласса
    public Student(String name, int age, String univer, int course) {
        super(name, age);
        this.univer = univer;
        this.course = course;
    }

    public String getUniver() {
        return univer;
    }

    public void setUniver(String univer) {
        this.univer = univer;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    //переопределение методов - создание метода в подклассе с таким же типом, именем и списком
    //параметров как и у метода суперкласса, с целью перекрытия метода и создания новой версии
    //справеливой для этого класса
    @Override // - аннотация утверждающая что данный метод переопределяет
    public void info(){
        //super.info(); через super. можно вызывать версию метода, которую мы переопределяем
        System.out.println("Student: " + getName() + ", " + getAge() + ", " + univer + ", " + course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", univer='" + univer + '\'' +
                ", course=" + course +
                '}';
    }
}
