package concurrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrencyExample9 {

    static List<Integer> arrayList = new ArrayList<>();
    static List<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList();

    public static void main(String[] args) throws InterruptedException {

        copyOnWriteArrayList.addAll(Arrays.asList(11, 22, 33, 44, 55));
        arrayList.addAll(Arrays.asList(11, 22, 33, 44, 55));

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                //arrayList.add(i);
                copyOnWriteArrayList.add(i);
            }
            //System.out.println("Thread1 name:" + Thread.currentThread().getName() + ", arraylist result: " + arrayList);
            System.out.println("Thread1 name:" + Thread.currentThread().getName() + ", copyOnArrayList result: " + copyOnWriteArrayList);
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                //arrayList.add(i);
                copyOnWriteArrayList.add(i);
            }
            //System.out.println("Thread2 name:" + Thread.currentThread().getName() + ", arrayList result: " + arrayList);
            System.out.println("Thread2 name:" + Thread.currentThread().getName() + ", copyOnArrayList result: " + copyOnWriteArrayList);
        });


        thread1.start();
        thread2.start();


        thread1.join();
        thread2.join();

        System.out.println(arrayList);
        System.out.println(copyOnWriteArrayList);
    }
}
