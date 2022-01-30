package collections;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args){

        Queue<Request> requestQueue = new ArrayDeque<>();
        requestQueue.offer(new Request("A","AAAA"));
        requestQueue.offer(new Request("B","BBBBB"));
        requestQueue.offer(new Request("C","CCCCC"));

        Iterator<Request> requestIterator = requestQueue.iterator();
        while(requestIterator.hasNext()){
            System.out.println(requestIterator.next());
        }
        System.out.println(requestQueue.peek());
        System.out.println(requestQueue.poll());
        System.out.println(requestQueue.peek());

        Queue<Integer> queueInteger = new ArrayDeque<>();
        queueInteger.offer(10);
        queueInteger.offer(15);

        Iterator<Integer> integerIterator = queueInteger.iterator();
        while(integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }
        System.out.println(queueInteger.peek());
        System.out.println(queueInteger.poll());


    }
}
