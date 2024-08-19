package lesson012.lesson12._02_sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {4, 8, 9, 3};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        String[] words = {
                "John",
                "Jack",
                "Mike",
                "Alan"
        };

        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        Pet[] pets = {
                new Pet ("Marsik"),
                new Pet("Barsik"),
                new Pet("Bim")
        };

        Arrays.sort(pets);
        System.out.println(Arrays.toString(pets));


    }
}
