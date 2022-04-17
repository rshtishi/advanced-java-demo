package concurrency;

import java.util.concurrent.Callable;

public class Producer {

    public void produce() {
        while (CustomBuffer.isFull()) {
        }
        CustomBuffer.add();
    }

    public void synchronizedProduce() {
        synchronized (CustomBuffer.lock) {
            if (CustomBuffer.isFull()) {
                try {
                    CustomBuffer.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            CustomBuffer.add();
            CustomBuffer.lock.notifyAll();
        }
    }

}
