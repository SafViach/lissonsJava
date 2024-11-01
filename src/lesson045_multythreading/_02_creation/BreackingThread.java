package lesson045_multythreading._02_creation;

import lombok.SneakyThrows;

public class BreackingThread extends Thread {
    @SneakyThrows
    @Override
    public void run() {
        Thread.sleep(10000);
        System.out.println("I am woke up!!!!");
    }
}
