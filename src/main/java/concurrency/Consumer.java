package concurrency;

public class Consumer {

    public static void consume() {
        while (CustomBuffer.isEmpty()) {
            System.out.println("Waiting to consume, thread: " + Thread.currentThread().getName());
        }
        System.out.println("Consuming, thread: " + Thread.currentThread().getName());
        CustomBuffer.remove();
    }
}
