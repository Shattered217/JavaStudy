package classwork;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

class BankAccount {
    private AtomicInteger balance = new AtomicInteger(0);

    public void deposit(int amount, String userId) {
        int newBalance = balance.addAndGet(amount);
        System.out.println("User " + userId + " deposited " + amount + ". New balance: " + newBalance);
    }

    public int getBalance() {
        return balance.get();
    }
}

public class Bank1Class {
    private static final int DEPOSIT_AMOUNT = 500;
    private static final int DEPOSIT_TIMES = 4;
    private static final int USER_COUNT = 3;

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        ExecutorService executorService = Executors.newFixedThreadPool(USER_COUNT);

        for (int i = 1; i <= USER_COUNT; i++) {
            String userId = "User" + i;
            executorService.execute(() -> {
                for (int j = 0; j < DEPOSIT_TIMES; j++) {
                    account.deposit(DEPOSIT_AMOUNT, userId);
                    try {
                        Thread.sleep(1000); // Simulate time taken for each deposit
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            });
        }

        executorService.shutdown();
    }
}