package concurrency;

public class LongWrapper {

    private long value;

    public void increment() {
        this.value++;
    }

    public long getValue() {
        return value;
    }
}
