package concurrency;

public class SafeSingleton2 {

    private static volatile SafeSingleton2 instance;
    private static Object lock = new Object();

    private SafeSingleton2() {
    }

    public static SafeSingleton2 getInstance() {
        if (instance != null) {
            return instance;
        }
        synchronized (lock) {
            if (instance == null) {
                delay();
                System.out.println("SafeSingleton2 object Created...");
                instance = new SafeSingleton2();
            }
        }
        return instance;
    }

    public static void delay() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
