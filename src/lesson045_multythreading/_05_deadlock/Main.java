package lesson045_multythreading._05_deadlock;

import lombok.SneakyThrows;

public class Main {
    static Object lock1 = new Object();
    static Object lock2 = new Object();

    public static void main(String[] args) {
        var t1 = new T1();
        var t2 = new T2();
        t1.start();
        t2.start();
    }

    private static class T1 extends Thread {
        @SneakyThrows
        @Override
        public void run() {
            synchronized (lock1) {
                System.out.println("T1 holding lock1...");
                Thread.sleep(10);
                System.out.println("T1 waiting lock2");
                synchronized (lock2) {
                    System.out.println("T1 holding lock1 and lock2");
                }
            }
        }
    }

    private static class T2 extends Thread {
        @SneakyThrows
        @Override
        public void run() {
            synchronized (lock1) {
                System.out.println("T2 holding lock2...");
                Thread.sleep(10);
                System.out.println("T2 waiting lock1");
                synchronized (lock2) {
                    System.out.println("T2 holding lock1 and lock2");
                }
            }
        }
    }
}
