import model.owners.GenOwner;
import model.subjects.Cat;
import model.subjects.Cleaner;
import model.subjects.Dog;
import model.subjects.Huskey;



public class Main4 {
    public static void main(String[] args) {
        //объекты, кем будут владеть
        Cat cat1 = new Cat("Barsik");
        Dog dog1 = new Dog("Rex");
        Huskey huskey1 = new Huskey("Barbos");
        Cleaner cleaner1 = new Cleaner("Samsung");

        //упрощенное создание объектов дженериков
        GenOwner<Cat> owner1 = new GenOwner<>("Igor", cat1);
        var owner2 = new GenOwner<Dog>("Vasya", dog1);
        GenOwner<Huskey> owner3 = new GenOwner<Huskey>("Ira", huskey1);

        //при отсутсвии параметризации при создании объекта класса
        //дженерика объект считается сырым(raw type) и будет
        //параметризирован Object
        GenOwner owner4 = new GenOwner("Vika", cleaner1);

        System.out.println(owner1);
        owner1.getSubject().sleep();
        System.out.println(owner2);
        owner2.getSubject().guard();
        System.out.println(owner3);
        owner3.getSubject().guard();
        owner3.getSubject().destroy();
        System.out.println(owner4);
        if(owner4.getSubject() instanceof Cleaner)
            ((Cleaner)owner4.getSubject()).vacuum();

        //при создании объекта он может быть параметризирован аюсолютно любым типом
        GenOwner<Integer> owner5 = new GenOwner<>("Misha", 10);

        //нельзя параметризировать примитивныим типом
        //GenOwner<int> owner6 = new GenOwner<>("Misha", 10);

    }
}
