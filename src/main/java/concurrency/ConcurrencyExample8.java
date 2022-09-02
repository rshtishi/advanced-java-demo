package concurrency;

import jdk.nashorn.internal.ir.Block;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.*;

public class ConcurrencyExample8 {

    static Queue<Integer> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
    static BlockingQueue<Integer> linkedTransferQueue = new LinkedTransferQueue<>();
    static BlockingQueue<Integer> synchronousQueue = new SynchronousQueue<>();
    static BlockingQueue<Integer> priorityBlockingQueue = new PriorityBlockingQueue<>(1000);
    static BlockingQueue<Integer> linkedBlockingQueue = new LinkedBlockingQueue<>();
    static BlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(1000);


    public static void main(String[] args) throws InterruptedException {

        Thread producer = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {

                try {
                    linkedTransferQueue.put(i);
                    synchronousQueue.put(i);
                    priorityBlockingQueue.put(i);
                    linkedBlockingQueue.put(i);
                    arrayBlockingQueue.put(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread producer2 = new Thread(()->{
            for(int i =0; i<1000;i++){
                concurrentLinkedQueue.offer(i);
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {

                try {
                    linkedTransferQueue.take();
                    synchronousQueue.take();
                    priorityBlockingQueue.take();
                    linkedBlockingQueue.take();
                    arrayBlockingQueue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer2 = new Thread(()->{
            for(int i=0;i<1000;i++){
                concurrentLinkedQueue.poll();
            }
        });

        producer.start();
        consumer.start();
        producer2.start();
        consumer2.start();
        producer.join();
        consumer.join();
        producer2.join();
        consumer2.join();

        System.out.println(linkedTransferQueue);
        System.out.println(synchronousQueue);
        System.out.println(priorityBlockingQueue);
        System.out.println(linkedBlockingQueue);
        System.out.println(arrayBlockingQueue);
        System.out.println(concurrentLinkedQueue);
    }
}
