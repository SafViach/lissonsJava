package lesson045_multythreading._06_stop;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        var t1 = new StopThread();
        t1.start();
        Thread.sleep(10000);
        t1.doStop();
    }
}
