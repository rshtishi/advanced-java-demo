package concurrency;

import java.util.concurrent.locks.ReentrantLock;

public class ConcurrencyExample5 {

    private static int counter = 0;
    private static Object lock = new Object();
    private static ReentrantLock reentrantLock = new ReentrantLock();

    public synchronized static void incrementByN(int n) {

        try {
            reentrantLock.lock();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < n; i++) {
                counter++;
                System.out.println("Counter: " + counter + ", Thread id: " + Thread.currentThread().getId());
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread[] threads = new Thread[10];

        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(() -> incrementByN(1));
            threads[i].start();
        }

        for (int i = 0; i < 10; i++) {
            threads[i].join();
        }


        System.out.println("Result: " + counter);

    }
}
