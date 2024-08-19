package lesson017.lesson14.task2;

//pets
//interfaces

import lesson017.lesson14.task2.model.interfaces.ISwim;
import lesson017.lesson14.task2.model.interfaces.IVoice;
import lesson017.lesson14.task2.model.pets.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //2.10
        Pet[] pets = {
                new Fish("Goldi", Color.COLOURFUL),
                new Dog("Rex", Color.BLACK),
                new British("Murka", Color.WHITE),
                new Norway("Barsik", Color.GRAY),
                new MaineCune("Giant", Color.COLOURFUL),
                new Fish("Star", Color.COLOURFUL),
                new Dog("Muhtar", Color.COLOURFUL),
                new British("Wiskas", Color.WHITE),
                new Norway("Felix", Color.BLACK),
                new MaineCune("Boris", Color.WHITE)
        };

        //2.12
        for (Pet pet : pets) {
            System.out.println(pet);
            pet.eat();
        }

        System.out.println("2.13");

        //массив для хроанение жиивотных которые умеют издавать голос
        IVoice[] voicePets = new IVoice[pets.length];
        int index = 0;

        for (Pet pet : pets) {
            //сопоставление с образцом после 17 версии
//            if(pet instanceof IVoice v){
//                voicePets[index++] = v;
//            }
            if (pet instanceof IVoice) {
                voicePets[index++] = (IVoice) pet;
            }
        }

        //подравниваем массив под количество элементов в нем
        voicePets = Arrays.copyOf(voicePets, index);

        for (IVoice pet : voicePets) {
            pet.voice();
        }

        System.out.println("2.14");

        for (Pet pet : pets) {
            if (pet instanceof Cat) {
                pet.eat();
            }
        }

        System.out.println("2.15");
        for (Pet pet : pets) {
            if (pet instanceof Fish) {
                ((Fish) pet).swim();
            }
        }

        System.out.println("2.16");
        for (Pet pet : pets) {
//            if(pet instanceof IVoice v){
//                v.voice();
//            }
            if (pet instanceof IVoice) {
                ((IVoice) pet).voice();
            }
        }

        //2.17 --------

        System.out.println("2.18");
        for (Pet pet : pets) {
            if (pet instanceof Cat && pet instanceof ISwim) {
                ((ISwim) pet).swim();
            }
        }

        //2.19

        //int[] counters = new int[Color.values().length];//создаем массив счетчиков под каждый
        //цвет

//        for (Pet pet : pets) {
//            counters[pet.getColor().ordinal()]++;//в соотвествии с ординалом цвета
//            //увеличиваем счетчик элемента массива
//        }
//
//        int max = counters[0];
//        int maxIndex = 0;
//
//        for (int i = 1; i < counters.length; i++) {
//            if (counters[i] > max) {
//                max = counters[i];
//                maxIndex = i;
//            }
//        }
//
//        System.out.println(Color.values()[maxIndex]);

        System.out.println(Pet.mostPopularColor(pets));


    }
}
