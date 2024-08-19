package lesson017.lesson14.task2;

import lesson017.lesson14.task2.model.pets.*;

public class Main2 {
    public static void main(String[] args) {
        PetList petList1 = new PetList();
        petList1.add(new Fish("Goldi", Color.COLOURFUL));
        petList1.add(new Dog("Rex", Color.BLACK));
        petList1.add(new British("Murka", Color.WHITE));
        petList1.add(new Norway("Barsik", Color.GRAY));
        petList1.add(new MaineCune("Giant", Color.COLOURFUL));
        petList1.add(new Fish("Star", Color.COLOURFUL));
        petList1.add(new Dog("Muhtar", Color.COLOURFUL));

        petList1.print();

        System.out.println("Доступ к объекту по индексу");
        System.out.println(petList1.getPetByIndex(0));

        System.out.println(petList1.mostPopularColor());
    }
}
