package lesson045_multythreading._03_order;

public class Main {
    private static volatile boolean running;

    public static void main(String[] args) {
        var t1 = new Thread(() -> {
            while (!running) {}
            System.out.println("You ");
        });
        var t2 = new Thread(() -> {
            running = true;
            System.out.println("I love ");
        });
        t1.start();
        t2.start();
    }
}
