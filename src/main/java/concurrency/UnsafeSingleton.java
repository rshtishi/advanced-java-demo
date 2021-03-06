package concurrency;

public class UnsafeSingleton {

    public static UnsafeSingleton instance = null;

    private UnsafeSingleton() {
    }

    public static UnsafeSingleton getInstance() {
        if (instance == null) {
            delay();
            System.out.println("UnsafeSingleton object Created...");
            instance = new UnsafeSingleton();
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
