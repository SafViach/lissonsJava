package lesson005.model;

//порядок работы методов класса при создании объекта
//1) new выделяет память (создает объект), ссылочные поля - null, примивтивные - 0
//2) инициализация полей при их описании
//3) блоки кода
//4) конструкторы
public class Dog {
    //java позволяет указать инициализацию при описании полей класса
    //такая инициализация обычно используется при отсутсвии конструкторов в классе
    private String name = "qwe";
    private int age = 2;

    //блоки кода - методы без имени, вызываются автоматически при создании объекта
    //используют при необоходимости выполниить какой-то код или вызвать какой-либо стандарный метод
    //при создании объекта, например взять текущее время или ифнормацию о часовом поясе
    {
        System.out.println("code block1");
        age = 9;
    }

    //конструктор - особый метод, который вызывается автоматически при создании объекта
    //и предназначен для инициализации полей объекта при его создании


    //чтобы не писать несколько конструкторов с большим сожержимым в джава есть возможжность
    //в теле конструктора вызвать конструктор этого же класса при помощи конструкции this()
    public Dog() {
        //вызов другого конструктора класа может быть только пеовой командой
        this("none", 0);//спровоцируем вызов конструктора с параметрами
        //name = "none";
        //age = 0;
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //геттеры - методы, которые помогают другим разработчикам получить
    //информацию о полях объекта. геттеры не дают прямой доступ к поля, а возвращют
    //копию значения поля
    public String getName() {
        //return this.name;
        return name;//this писать необязательно, автоматически подставится
    }

    public int getAge() {
        return age;
    }

    //сеттеры для изменения закрытых полей. паринимают значение, которые нужно записать в поле, его
    //можно проверить на корректность, и если все ок, то записать это значение в поле объекта

    //в каждом метод есть неявная ссылка this - ссылка на объект для которого был вызван метод

    //имя не должно быть меньше двух символов
    public void setName(String name) {
        if (name.length() >= 2) {
            this.name = name;
        }
    }

    //может быть от 0 до 20
    public void setAge(int age) {
        if (age >= 0 && age <= 20)
            this.age = age;
    }

    public void print(){
        System.out.println("Dog: name - " + name + ", age - " + age);// this.age    this.name
    }

    {
        System.out.println("code block2");
    }

}
