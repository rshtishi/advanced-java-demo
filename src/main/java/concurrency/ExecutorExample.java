package concurrency;

import java.util.concurrent.*;

public class ExecutorExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

        Runnable task = () -> System.out.println("hello world");
        singleThreadExecutor.execute(task);

        Callable<String> task2 = () -> "Hello Rando";
        Future<String> result = singleThreadExecutor.submit(task2);
        System.out.println(result.get());

        Callable<String> task3 = () -> {
            Thread.sleep(500);
            return "Hello "+Thread.currentThread().getName();
        };
        Future<String> result2 = singleThreadExecutor.submit(task3);
        try {
            System.out.println(result2.get(100,TimeUnit.MILLISECONDS));
        } catch (TimeoutException e) {
            e.printStackTrace();
        }

        singleThreadExecutor.shutdown();
    }
}
