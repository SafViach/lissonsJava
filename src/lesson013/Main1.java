package lesson013;

import lesson013.model.Producer;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        Producer[] producers = {
                new Producer("China", 1950),
                new Producer("USA", 1970),
                new Producer("China", 1930),
                new Producer("Germany", 1920)
        };

        Arrays.sort(producers);

        for (Producer producer : producers) {
            System.out.println(producer);
        }

    }
}
