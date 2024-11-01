package lesson045_multythreading._02_creation;

public class DaemonDemo {
    public static void main(String[] args) throws InterruptedException {
        var t1 = new BreackingThread();
        t1.setDaemon(true);
        t1.start();
        Thread.sleep(3000);
        System.out.println("Finish app...");
    }
}
