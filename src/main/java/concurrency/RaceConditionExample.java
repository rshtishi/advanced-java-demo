package concurrency;

public class RaceConditionExample {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int index = 0; index < 10; index++) {
                    UnsafeSingleton instance = UnsafeSingleton.getInstance();
                    SafeSingleton1 instance1 = SafeSingleton1.getInstance();
                    SafeSingleton2 instance2 = SafeSingleton2.getInstance();
                    SingletonEnum instance3 = SingletonEnum.INSTANCE;
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int index = 0; index < 10; index++) {
                    UnsafeSingleton instance = UnsafeSingleton.getInstance();
                    SafeSingleton1 instance1 = SafeSingleton1.getInstance();
                    SafeSingleton2 instance2 = SafeSingleton2.getInstance();
                    SingletonEnum instance3 = SingletonEnum.INSTANCE;
                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int index = 0; index < 10; index++) {
                    UnsafeSingleton instance = UnsafeSingleton.getInstance();
                    SafeSingleton1 instance1 = SafeSingleton1.getInstance();
                    SafeSingleton2 instance2 = SafeSingleton2.getInstance();
                    SingletonEnum instance3 = SingletonEnum.INSTANCE;
                }
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
