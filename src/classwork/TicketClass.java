package classwork;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class TicketClass {
    private static final int TOTAL_TICKETS = 500;
    private static final int WINDOW_COUNT = 6;
    private static final int TICKET_INTERVAL = 10000; // 10 seconds in milliseconds

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(WINDOW_COUNT);
        AtomicInteger ticketCounter = new AtomicInteger(1);

        for (int i = 1; i <= WINDOW_COUNT; i++) {
            int windowNumber = i;
            executorService.execute(() -> {
                while (true) {
                    int ticketNumber = ticketCounter.getAndIncrement();
                    if (ticketNumber > TOTAL_TICKETS) {
                        break;
                    }
                    System.out.println("Window " + windowNumber + " sold ticket number " + ticketNumber + " at " + System.currentTimeMillis());
                    try {
                        Thread.sleep(TICKET_INTERVAL);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            });
        }

        executorService.shutdown();
    }
}
