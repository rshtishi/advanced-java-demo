package concurrency;

public class ConcurrencyExample {

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(10);
        System.out.println(Thread.currentThread().getName() + " Concurrency Example");

        Thread counterThread = new Thread(new Counter());
        Thread randomGeneratorThread = new RandomGenerator();

        counterThread.start();
        randomGeneratorThread.start();
    }
}
