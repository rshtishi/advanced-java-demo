package concurrency;

public enum SingletonEnum {

    INSTANCE;

    private SingletonEnum(){
        delay();
        System.out.println("SingletonEnum object Created...");
    }

    public static void delay() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
