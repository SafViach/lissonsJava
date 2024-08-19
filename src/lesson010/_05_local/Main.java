package lesson010._05_local;

import lesson010._05_local.model.Child;

//локальные - классы котрые создаются внутри метода
public class Main {
    public static void main(String[] args) {
        Child child1 = new Child("Igor", 5);
        System.out.println(child1);
        child1.sleep();
        System.out.println(child1);
    }
}
