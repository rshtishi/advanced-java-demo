package concurrency;

public class Consumer {

    public void consume() {
        while (CustomBuffer.isEmpty()) {
        }
        CustomBuffer.remove();
    }

    public void synchronizedConsume() {
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

    public void safeConsume() throws InterruptedException {
        try {
            CustomBuffer.reentrantLock.lock();
            while (CustomBuffer.isEmpty()) {
                CustomBuffer.isEmpty.await();
            }
            CustomBuffer.remove();
            CustomBuffer.isFull.signalAll();
        } finally {
            CustomBuffer.reentrantLock.unlock();
        }
    }
}
