package collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Stack;

public class StackExample {

    public static void main(String[] args){

        Stack<CustomMethod> stackCustomMethod = new Stack<>();
        stackCustomMethod.push(new CustomMethod("main"));
        stackCustomMethod.push(new CustomMethod("A"));
        stackCustomMethod.push(new CustomMethod("B"));

        Iterator<CustomMethod> iterator = stackCustomMethod.iterator();

        while(iterator.hasNext()){
            CustomMethod customMethod = stackCustomMethod.pop();
            customMethod.execute();
        }

        System.out.println("Stack");
        Stack<Integer> stackInteger = new Stack<>();
        stackInteger.push(1);
        stackInteger.push(2);
        stackInteger.push(3);

        System.out.println(stackInteger.peek());
        System.out.println(stackInteger.pop());
        System.out.println(stackInteger.peek());
        System.out.println(stackInteger.pop());
        System.out.println(stackInteger.peek());
        System.out.println(stackInteger.pop());

        System.out.println("Deque");
        Deque<Integer> integerDeque = new ArrayDeque<>();
        integerDeque.push(1);
        integerDeque.push(2);
        System.out.println(integerDeque.peek());
        System.out.println(integerDeque.pop());
        System.out.println(integerDeque.peek());
        System.out.println(integerDeque.pop());

    }
}
