package lesson045_multythreading._07_interrupt;

public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        var t1 = new InterruptThread();
        t1.start();
        Thread.sleep(10000);
        t1.interrupt();
    }
}
