package concurrency;

public class RaceConditionExample2 {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Current thread: " + Thread.currentThread().getName());

        LongWrapper longWrapper = new LongWrapper();
        SafeLongWrapper safeLongWrapper = new SafeLongWrapper();
        Thread[] threads = new Thread[1000];
        for (int index = 0; index < 1000; index++) {
            threads[index] = new Thread(() -> {
                for (int i = 0; i < 1000; i++) {
                    longWrapper.increment();
                    safeLongWrapper.increment();
                }
            });
            threads[index].start();
        }
        for (int index = 0; index < threads.length;index++) {
            threads[index].join();
        }

        System.out.println("LongWrapper value: "+longWrapper.getValue());
        System.out.println("SafeLongWrapper value: "+safeLongWrapper.getValue());
    }
}
