package lesson045_multythreading._04_racing;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BankAccount {
    private long balance;

    private final Object lock = new Object();

    //public synchronized void withdraw(long amount) {
    public void withdraw(long amount) {
        synchronized (lock) {
            var newBalance = balance - amount;
            balance = newBalance;
        }
    }

    public synchronized void deposit(long amount) {
        var newBalance = balance + amount;
        balance = newBalance;
    }

    @Override
    public String toString() {
        return String.valueOf(balance);
    }
}
