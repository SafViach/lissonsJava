import model.owners.GenOwner;
import model.owners.HuskeyOwner;
import model.subjects.Cat;
import model.subjects.Cleaner;
import model.subjects.Dog;
import model.subjects.Huskey;

//Использование параметризированных классов позволяет при наличии одиного класса
//создавть объекты этого класса с полями различных типов без необходимости
//проверки и явного преобразования при использовании этих полей

//механизм праметризации в Java работает на этапе компиляции:
//при компиляция проиходит стирание типов и подстановка Object явно преобразованного
//к указанному типу, чтобы получить ошибку компиляции при несоответствии

public class Main3 {
    public static void main(String[] args) {
        //объекты, кем будут владеть
        Cat cat1 = new Cat("Barsik");
        Dog dog1 = new Dog("Rex");
        Huskey huskey1 = new Huskey("Barbos");
        Cleaner cleaner1 = new Cleaner("Samsung");

        //создание объекта параметризированного класса
        GenOwner<Cat> owner1 = new GenOwner<Cat>("Igor", cat1);
        GenOwner<Dog> owner2 = new GenOwner<Dog>("Vasya", dog1);
        GenOwner<Huskey> owner3 = new GenOwner<Huskey>("Ira", huskey1);
        GenOwner<Cleaner> owner4 = new GenOwner<Cleaner>("Vika", cleaner1);

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
