import model.owners.ObjOwner;
import model.subjects.Cat;
import model.subjects.Cleaner;
import model.subjects.Dog;
import model.subjects.Huskey;

//Создание схожих объектов, но с полями различных типов
//2) создание класса c полеим типа Object

//минусы - при обращении к предметиу владения приходтся явно преобразовывать
// к нужному типу для вызова спец метода
//нет ошибки компиляции при создании объекта с нежелаемым типом
//перед явным преобразованием нужно выполнять проверку

//плюсы - не нужно плодить много классов, достаточно одного


public class Main2 {
    public static void main(String[] args) {
        //объекты, кем будут владеть
        Cat cat1 = new Cat("Barsik");
        Dog dog1 = new Dog("Rex");
        Huskey huskey1 = new Huskey("Barbos");
        Cleaner cleaner1 = new Cleaner("Samsung");

        ObjOwner owner1 = new ObjOwner("Igor", cat1);
        ObjOwner owner2 = new ObjOwner("Vasya", dog1);
        ObjOwner owner3 = new ObjOwner("Ira", huskey1);
        ObjOwner owner4 = new ObjOwner("Vika", cleaner1);

        System.out.println(owner1);
        //owner1.getSubject().sleep();не можем вызвать специфический метод
        //так возвращаемый тип - Object
        ((Cat)owner1.getSubject()).sleep();
        System.out.println(owner2);
        if(owner2.getSubject() instanceof Dog)//перед явным преобразованием
            ((Dog)owner2.getSubject()).guard();//нужно проверить возможно ли это
        System.out.println(owner3);
        ((Huskey)owner3.getSubject()).guard();
        ((Huskey)owner3.getSubject()).destroy();
        System.out.println(owner4);
        ((Cleaner)owner4.getSubject()).vacuum();

    }
}
