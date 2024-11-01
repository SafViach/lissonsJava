package lesson045_multythreading._04_racing;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        var ba = new BankAccount(100);

        var t1 = new Thread(() -> {
            for (int i=0; i < 100000; i++) {
                ba.deposit(100);
            }
        });
        var t2 = new Thread(() -> {
            for (int i=0; i < 100000; i++) {
                ba.withdraw(100);
            }
        });
        var start = LocalDateTime.now().getNano();

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(ba);
        var finish = LocalDateTime.now().getNano();
        System.out.println(finish - start);
    }
}
