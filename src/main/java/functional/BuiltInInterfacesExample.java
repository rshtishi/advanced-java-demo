package functional;

import java.util.function.*;

public class BuiltInInterfacesExample {

    public static void main(String[] args) {

        Supplier<String> supplier = () -> { return "Rando";};
        System.out.println("Supplier: " + supplier.get());

        Supplier<Integer> integerSupplier = () -> 5;
        System.out.println("Supplier Integer: "+integerSupplier.get());

        System.out.println("\nConsumer");
        Consumer<Integer> consumer = (a) -> System.out.println("Square Area: " + (a * a));
        consumer.accept(10);

        System.out.println("\nBiConsumer");
        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println("Rectangle Area: " + (a * b));
        biConsumer.accept(10, 5);

        System.out.println("\nPredicate");
        Predicate<String> predicate = (s) -> s.isEmpty();
        System.out.println(predicate.test("Rando"));

        System.out.println("\nBiPredicate");
        BiPredicate<String, String> biPredicate = (s1, s2) -> s1.startsWith(s2);
        System.out.println(biPredicate.test("Rando", "Ra"));

        System.out.println("\nFunction");
        Function<String, Integer> function = (s) -> s.length();
        System.out.println(function.apply("rando"));

        System.out.println("\nBiFunction");
        BiFunction<String, String, Integer> biFunction = (s1, s2) -> s1.length() + s2.length();
        System.out.println(biFunction.apply("Rando", "Shtishi"));

        System.out.println("\nUnaryOperator");
        UnaryOperator<Integer> unaryOperator = (a) -> a * a;
        System.out.println(unaryOperator.apply(5));

        System.out.println("\nBinaryOperator");
        BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
        System.out.println(binaryOperator.apply(10,10));

    }
}
