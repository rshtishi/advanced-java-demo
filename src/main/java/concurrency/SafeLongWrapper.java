package concurrency;

public class SafeLongWrapper {

    private Object lock = new Object();
    private volatile long value;

    public void increment() {
        synchronized (this){
            value++;
        }
    }

    public long getValue() {
        return value;
    }
}
