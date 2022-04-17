package concurrency;

public class Consumer {

    public void consume() {
        while (CustomBuffer.isEmpty()) {
        }
        CustomBuffer.remove();
    }

    public static void synchronizedConsume() {
        synchronized (CustomBuffer.lock) {
            if (CustomBuffer.isEmpty()) {
                try {
                    CustomBuffer.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            CustomBuffer.remove();
            CustomBuffer.lock.notifyAll();
        }
    }
}
