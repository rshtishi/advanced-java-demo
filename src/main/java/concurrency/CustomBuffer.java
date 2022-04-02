package concurrency;

public class CustomBuffer {
    public static final int SIZE = 10;
    private static int[] buffer = new int[SIZE];
    public static int index = 0;

    public static boolean isFull() {
        return index == (SIZE - 1);
    }

    public static boolean isEmpty() {
        return index == 0;
    }

    public static void add() {
        buffer[index] = 1;
        index++;
    }

    public static void remove() {
        buffer[index] = 0;
        index--;
    }

    public static int value(int index){
        return buffer[index];
    }
}
