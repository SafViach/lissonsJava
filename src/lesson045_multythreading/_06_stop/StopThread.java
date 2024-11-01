package lesson045_multythreading._06_stop;

import lombok.SneakyThrows;

public class StopThread extends Thread{
    private boolean doStop;

    public synchronized void doStop() {
        doStop = true;
    }

    private synchronized boolean keepRunning() {
        return !doStop;
    }

    @SneakyThrows
    @Override
    public void run() {
        while (keepRunning()) {
            System.out.println("I am running");
            Thread.sleep(3000);
        }
    }
}
