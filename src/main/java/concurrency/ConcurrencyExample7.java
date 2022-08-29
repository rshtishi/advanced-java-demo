package concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ConcurrencyExample7 {

    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);

        executorService.submit(() -> System.out.println("Thread id: " + Thread.currentThread().getId()));

        executorService.scheduleWithFixedDelay(() -> {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread id: " + Thread.currentThread().getId());
                }
                , 0L, 100L, TimeUnit.MILLISECONDS);

        executorService.scheduleAtFixedRate(() -> {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("X Thread id: " + Thread.currentThread().getId());
                }
                , 0L, 100L, TimeUnit.MILLISECONDS);

        try {
            executorService.awaitTermination(500, TimeUnit.MILLISECONDS);
        } catch (
                InterruptedException e) {
            e.printStackTrace();
        }

    }
}
