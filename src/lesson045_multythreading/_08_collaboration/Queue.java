package lesson045_multythreading._08_collaboration;

import lombok.SneakyThrows;

public class Queue {
    private int n;
    boolean valueSet;

    @SneakyThrows
    public synchronized void get() {
        while (!valueSet) {
            wait();
        }
        System.out.println("Received " + n);
        valueSet = false;
        notify();
    }

    @SneakyThrows
    public synchronized void put(int n) {
        while (valueSet) {
            wait();
        }
        valueSet = true;
        this.n = n;
        System.out.println("Sent " + n);
        notify();
    }
}
