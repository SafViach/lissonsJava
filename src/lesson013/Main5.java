package lesson013;

import lesson013.model.Producer;

import java.util.Arrays;
import java.util.Comparator;

public class Main5 {
    public static void main(String[] args) {
        Producer[] producers = {
                new Producer("China", 1950),
                new Producer("USA", 1970),
                new Producer("China", 1930),
                new Producer("Germany", 1920)
        };

        Arrays.sort(producers, new Comparator<Producer>() {
            @Override
            public int compare(Producer producer1, Producer producer2) {
                return producer1.getYear() - producer2.getYear();
            }
        });

        for (Producer producer : producers) {
            System.out.println(producer);
        }

        System.out.println("-----------------------------");

        Arrays.sort(producers, new Comparator<Producer>() {
            @Override
            public int compare(Producer producer1, Producer producer2) {
                return producer1.getCountry().compareTo(producer2.getCountry());
            }
        });

        for (Producer producer : producers) {
            System.out.println(producer);
        }

    }
}
