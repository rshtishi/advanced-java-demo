package functional;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MethodReferencesExample {

    public static void main(String[] args) {

        System.out.println("Reference to static method");
        Consumer<String> consumer = System.out::println;
        consumer.accept("Rando");

        System.out.println("\nReference to instance method to particular object");
        String s = "Rando";
        Supplier<Integer> supllier = s::length;
        System.out.println(supllier.get());

        System.out.println("Reference to instance constructor");
        UnaryOperator<String> unaryOperator = String::new;
        System.out.println(unaryOperator.apply("Rando"));

    }
}
