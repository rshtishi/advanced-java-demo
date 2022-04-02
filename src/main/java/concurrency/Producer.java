package concurrency;

import java.util.concurrent.Callable;

public class Producer {

    public static void produce() {
        while (CustomBuffer.isFull()) {
            System.out.println("Waiting to produce, thread: " + Thread.currentThread().getName());
        }
        System.out.println("Producing, thread: " + Thread.currentThread().getName());
        CustomBuffer.add();
    }

}
