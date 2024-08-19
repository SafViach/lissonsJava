package lesson006.lesson06.model;


public class User {
    private static int idCounter;
    private int id;
    private String name;

    //static блок кода запускается один раз при прогрузке класса
    //класс будет прогружен в память при создании объекта или
    //использовании static поля
    static {
        idCounter = 0;
        System.out.println("static code block");
    }

    //чтобы не выполнять в конструкторе логику увеличения, выносим ее в блок кода
    {
        id = ++idCounter;
        System.out.println("code block");
    }

    public User(String name) {
        this.name = name;
        //id = ++idCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void info() {
        System.out.println("id: " + id + ", name: " + name);
    }
}
