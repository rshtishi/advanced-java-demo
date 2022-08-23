package concurrency;

public class ConcurrencyExample4 {

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread: " + Thread.currentThread().getName() + ", count:" + i);

                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 5; i < 10; i++) {
                    try {
                        Thread.sleep(9);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread: " + Thread.currentThread().getName() + ", count:" + i);

                }
            }
        });

        thread1.start();
        thread1.join();
        thread2.start();
    }
}
