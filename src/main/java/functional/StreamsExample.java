package functional;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {

    public static void main(String[] args) {

        System.out.println("Creating Streams");
        Stream<String> empty = Stream.empty();
        Stream<Integer> single = Stream.of(1);
        Stream<Integer> multiple = Stream.of(1, 2, 3);
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        Stream<Integer> fromList = list.stream();
        Stream<Double> randoms = Stream.generate(Math::random);
        Stream<Integer> oddNumber = Stream.iterate(1, n -> n + 2);
        Stream<Integer> duplicates = Stream.of(1,1,1,2,2,3,3,3,3);

        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("Bonobo");
        List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);

        //terminal operation
        System.out.println("Count: " + empty.count());
        multiple.forEach(System.out::println);
        System.out.println("Min: " + list.stream().min((a,b)->a.compareTo(b)));
        System.out.println("Max: " + list.stream().max(Integer::compareTo));
        System.out.println("Find Any: " + list.stream().findAny());
        System.out.println("Find First: " + list.stream().findFirst());
        System.out.println(fromList.reduce(0, (subtotal, element) -> subtotal += element));
        Set<Integer> set = list.stream().collect(HashSet::new, HashSet::add, HashSet::addAll);
        System.out.println(set);

        //intermediate operation
        System.out.println(list.stream().filter(a->a==2).findFirst());
        duplicates.distinct().forEach(System.out::println);
        System.out.println(oddNumber.skip(2).limit(5).collect(Collectors.toList()));
        list.stream().map(a->a*a).forEach(System.out::println);

        System.out.println(animals.flatMap(animal -> animal.stream()).collect(Collectors.toList()));


    }
}
