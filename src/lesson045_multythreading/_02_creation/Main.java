package lesson045_multythreading._02_creation;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Creation thread from: " + Thread.currentThread());
        var myThread = new MyThread();
        myThread.setPriority(1);
        myThread.start();
        System.out.println("Leaving from: " + Thread.currentThread());

        System.out.println("Creation thread from: " + Thread.currentThread());
        var myRunnable = new Thread(new MyRunnable());
        myRunnable.setPriority(10);
        myRunnable.start();
        System.out.println("Leaving from: " + Thread.currentThread());

        var t1 = new Thread(() -> {
            System.out.println("hello with lambda");
        });

        var t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello with anonymous class");
            }
        });
    }
}
