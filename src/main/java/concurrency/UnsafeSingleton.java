package concurrency;

public class UnsafeSingleton {

    public static UnsafeSingleton instance = null;

    private UnsafeSingleton() {
    }

    public static UnsafeSingleton getInstance() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (instance == null) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Created...");
            instance = new UnsafeSingleton();
        }
        return instance;
    }
}
