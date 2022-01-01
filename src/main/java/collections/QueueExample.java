package collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args){
        Queue<Integer> queueInteger = new ArrayDeque<>();
        queueInteger.offer(10);
        queueInteger.offer(15);
        System.out.println(queueInteger.peek());
        System.out.println(queueInteger.poll());
        System.out.println(queueInteger.peek());
        System.out.println(queueInteger.poll());
        System.out.println(queueInteger.peek());

    }
}
