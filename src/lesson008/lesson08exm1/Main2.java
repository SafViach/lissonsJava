package lesson008.lesson08exm1;

import lesson008.lesson08exm1.model.Worker;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        Worker[] workers = {
                new Worker("Ignat", 500),
                new Worker("Fedya", 700),
                new Worker("Asya", 650)
        };

        System.out.println(Arrays.toString(workers));

        for (Worker worker : workers) {
            System.out.println(worker);
        }

    }
}
