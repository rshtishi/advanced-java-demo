package concurrency;

public class LongWrapper {

    private long value;

    public void increment() {
        value++;
    }

    public long getValue() {
        return value;
    }
}
