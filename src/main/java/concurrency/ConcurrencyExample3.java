package concurrency;

public class ConcurrencyExample3 {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    if (i > 3) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            Thread.currentThread().interrupt();
                            break;
                        }
                    }

                    System.out.println("Thread: " + Thread.currentThread().getName() + ", count:" + i);
                }
            }
        });

        thread1.start();

        thread1.interrupt();

    }
}
