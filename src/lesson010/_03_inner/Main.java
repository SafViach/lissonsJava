package lesson010._03_inner;

import lesson010._03_inner.model.Cat;
import lesson010._03_inner.model.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rex", 30);
        System.out.println(dog1);
        dog1.wagTail();
        //----------------------------------

        Cat cat1 = new Cat("Barsik", 25);
        System.out.println(cat1);
        cat1.wagTail();
        Cat.CatTail tail1 = cat1.new CatTail(45);
        tail1.wag();
    }
}
