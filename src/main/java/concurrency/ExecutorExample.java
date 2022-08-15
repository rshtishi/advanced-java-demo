package concurrency;

import java.util.concurrent.*;

public class ExecutorExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        ExecutorService multiThreadExecutors = Executors.newFixedThreadPool(4);
        ExecutorService cacheTreadExecutors = Executors.newCachedThreadPool();
        ScheduledExecutorService scheduleThreadExecutors = Executors.newScheduledThreadPool(2);
        Runnable task = () -> System.out.println("hello world, thread:" + Thread.currentThread().getName());

        //Single Thread Executor Example
        System.out.println("Single Thread Executor");
        for (int i = 0; i < 5; i++) {
            singleThreadExecutor.execute(task);
        }

        //Multi Thread Executor Example
        System.out.println("\nMulti Thread Executor");
        for (int i = 0; i < 5; i++) {
            multiThreadExecutors.execute(task);
        }

        //Cached Thread Executor Example
        System.out.println("\n Cached Thread Executor");
        for (int i = 0; i < 5; i++) {
            cacheTreadExecutors.execute(task);
        }

        //Scheduled Thread Executors
        System.out.println("\n Scheduled Thread Executor");
        for (int i = 0; i < 5; i++) {
            scheduleThreadExecutors.schedule(task,1000,TimeUnit.MILLISECONDS);
        }

        // Callable Examples
        Callable<String> task2 = () -> "Hello Rando";
        Future<String> result = singleThreadExecutor.submit(task2);
        System.out.println(result.get());

        Callable<String> task3 = () -> {
            Thread.sleep(500);
            return "Hello " + Thread.currentThread().getName();
        };
        Future<String> result2 = singleThreadExecutor.submit(task3);
        try {
            System.out.println(result2.get(100, TimeUnit.MILLISECONDS));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }

        Callable<String> task4 = () -> {
            throw new IllegalStateException("Exception thrown on thread" + Thread.currentThread().getName());
        };
        Future<String> result3 = singleThreadExecutor.submit(task4);
        try {
            result3.get();
        } catch (Exception e) {
            e.printStackTrace();
        }

        singleThreadExecutor.shutdown();
        multiThreadExecutors.shutdown();
        cacheTreadExecutors.shutdown();
        scheduleThreadExecutors.shutdown();
    }
}
