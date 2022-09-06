package concurrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcurrencyExample9 {

    static List<Integer> arrayList = new ArrayList<>();
    static List<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList();
    static Set<Integer> copyOnWriteArraySet = new CopyOnWriteArraySet<>();

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

        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                //arrayList.add(i);
                copyOnWriteArraySet.add(i);
            }
            //System.out.println("Thread1 name:" + Thread.currentThread().getName() + ", arraylist result: " + arrayList);
            System.out.println("Thread3 name:" + Thread.currentThread().getName() + ", copyOnArraySet result: " + copyOnWriteArraySet);
        });

        Thread thread4 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                //arrayList.add(i);
                copyOnWriteArraySet.add(i);
            }
            //System.out.println("Thread2 name:" + Thread.currentThread().getName() + ", arrayList result: " + arrayList);
            System.out.println("Thread4 name:" + Thread.currentThread().getName() + ", copyOnArraySet result: " + copyOnWriteArraySet);
        });


        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();


        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();


        System.out.println("ArrayList: " + arrayList);
        System.out.println("CopyOnWriteArrayList: " + copyOnWriteArrayList);
        System.out.println("CopyOnWriteArraySet: " + copyOnWriteArraySet);
    }
}
