import model.owners.CatOwner;
import model.owners.CleanerOwner;
import model.owners.DogOwner;
import model.owners.HuskeyOwner;
import model.subjects.Cat;
import model.subjects.Cleaner;
import model.subjects.Dog;
import model.subjects.Huskey;

//Создание схожих объектов, но с полями различных типов
//1) создание класса для кажого типа

//минусы - приходится создавать слишком много классов
//плюсы - через объекты классов получаем доступ к полю сразу в соответствии
//с нужным типом, что без проблем позволяет вызывать специфические методы

public class Main1 {
    public static void main(String[] args) {

        //объекты, кем будут владеть
        Cat cat1 = new Cat("Barsik");
        Dog dog1 = new Dog("Rex");
        Huskey huskey1 = new Huskey("Barbos");
        Cleaner cleaner1 = new Cleaner("Samsung");

        CatOwner owner1 = new CatOwner("Igor", cat1);
        DogOwner owner2 = new DogOwner("Vasya", dog1);
        HuskeyOwner owner3 = new HuskeyOwner("Ira", huskey1);
        CleanerOwner owner4 = new CleanerOwner("Vika", cleaner1);

        System.out.println(owner1);
        owner1.getSubject().sleep();
        System.out.println(owner2);
        owner2.getSubject().guard();
        System.out.println(owner3);
        owner3.getSubject().guard();
        owner3.getSubject().destroy();
        System.out.println(owner4);
        owner4.getSubject().vacuum();


    }
}
