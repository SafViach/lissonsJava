package lesson045_multythreading._08_collaboration;

public class Main {
    public static void main(String[] args) {
        var queue = new Queue();
        var producer = new Producer(queue);
        var consumer = new Consumer(queue);

        var t1 = new Thread(producer);
        var t2 = new Thread(consumer);

        t1.start();
        t2.start();
    }
}
