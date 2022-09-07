package concurrency;

import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrencyExample10 {

    static Set<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();

    public static void main(String[] args) throws InterruptedException {

        concurrentSkipListSet.addAll(Arrays.asList(1111, 2222, 3333, 4444, 5555));

        Thread thread1 = new Thread(() -> {
            for(int i=0;i<10;i++){
                concurrentSkipListSet.add(1000+i);
            }
        });

        Thread thread2 = new Thread(()->{
            for(int i=0;i<1000;i++){
                concurrentSkipListSet.add(i);
            }
        });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(concurrentSkipListSet);

    }
}
