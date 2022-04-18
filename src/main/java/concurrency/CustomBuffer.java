package concurrency;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CustomBuffer {

    public static Object lock = new Object();
    public static Lock reentrantLock = new ReentrantLock();
    public static Condition isEmpty = reentrantLock.newCondition();
    public static Condition isFull = reentrantLock.newCondition();
    public static final int SIZE = 10;
    private static int[] buffer = new int[SIZE];
    public static int index = 0;

    public static boolean isFull() {
        return index == buffer.length;
    }

    public static boolean isEmpty() {
        return index == 0;
    }

    public static void add() {
        buffer[index++] = 1;
    }

    public static void remove() {
        buffer[--index] = 0;
    }

    public static int value(int index) {
        return buffer[index];
    }
}
