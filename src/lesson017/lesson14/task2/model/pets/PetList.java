package lesson017.lesson14.task2.model.pets;

import java.util.Arrays;

public class PetList {
    public static final int SIZE = 5;
    private Pet[] pets = new Pet[5];
    private int index = 0;

    public void add(Pet pet) {
        //если массив уже под завязку заполнен
        //то увиличваем его на 50%
        if (pets.length == index) {
            pets = Arrays.copyOf(pets, index * 3 / 2 + 1);
        }
        pets[index++] = pet;
    }

    public void print() {
        System.out.println("petList:");
        for (int i = 0; i < index; i++) {
            System.out.println(pets[i]);
        }
    }

    public Pet getPetByIndex(int ind) {
        if (ind < 0 || ind >= index) throw new ArrayIndexOutOfBoundsException(ind);
        return pets[ind];
    }

    public Color mostPopularColor(){

        int[] counters = new int[Color.values().length];//создаем массив счетчиков под каждый
        //цвет

        for (int i = 0; i <index; i++) {
            counters[pets[i].getColor().ordinal()]++;//в соотвествии с ординалом цвета
            //увеличиваем счетчик элемента массива
        }

        int max = counters[0];
        int maxIndex = 0;

        for (int i = 1; i < counters.length; i++) {
            if (counters[i] > max) {
                max = counters[i];
                maxIndex = i;
            }
        }

        return Color.values()[maxIndex];
    }

}
