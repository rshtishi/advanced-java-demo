package concurrency;

public class CustomBuffer {

    public static Object lock = new Object();
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
