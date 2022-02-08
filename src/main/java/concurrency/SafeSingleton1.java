package concurrency;

public class SafeSingleton1 {

    private static SafeSingleton1 instance;

    private SafeSingleton1(){
    }

    public static synchronized SafeSingleton1 getInstance() {
        if (instance == null) {
            delay();
            System.out.println("SafeSingleton1 object Created...");
            instance = new SafeSingleton1();
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
