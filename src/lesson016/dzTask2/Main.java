package lesson016.dzTask2;
//2. Создать класс Pet c полями кличка и возраст. Создать класс обертку PetList, реализующий
//массив питомцев Pet фиксированной максимальной длины = 5. Для класса PetList
//определить методы добавления питомца в список, удаления питомца из списка по индексу,
//получения информации о питомце по индексу, вывода информации обо всех питомцах. При
//реализации класса PetList предусмотреть возможные исключительные ситуации (например,
//невозможность добавления животного при полном списке, попытка обращения к животному по
//некорректному индексу). Продемонстрировать работу методов класса PetList

import lesson016.dzTask2.model.Pet;
import lesson016.dzTask2.model.PetList;

public class Main {
    public static void main(String[] args) {
        PetList petList1 = new PetList();
        petList1.add(new Pet("barsik",1));
        petList1.add(new Pet("barsik",2));
        petList1.add(new Pet("barsik",3));
        petList1.add(new Pet("barsik",4));
        petList1.add(new Pet("barsik",5));
        petList1.add(new Pet("barsik",6));
        petList1.add(new Pet("barsik",7));
        petList1.add(new Pet("barsik",8));
        petList1.add(new Pet("barsik",9));
        petList1.add(new Pet("barsik",10));
        petList1.add(new Pet("barsik",11));
        petList1.add(new Pet("barsik",12));
        petList1.add(new Pet("barsik",13));
        petList1.add(new Pet("barsik",14));
        System.out.println(petList1.infoIndex(11));
        System.out.println("-------------------------------");
        petList1.infoArray();
        petList1.setPets(petList1.deletedIndex(5));
        petList1.infoArray();
        System.out.println("-----------------------------------");
        try {
            System.out.println(petList1.infoIndex(15));
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("вышли за пределы массива");
        }






    }
}
