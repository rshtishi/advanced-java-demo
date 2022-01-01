package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {

        Set<String> stringSet = new HashSet<>();
        stringSet.add("John");
        stringSet.add("Jim");
        stringSet.add("Jack");
        stringSet.add("Jack");
        System.out.println(stringSet);

        Set<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("John");
        stringTreeSet.add("Jim");
        stringTreeSet.add("Jack");
        stringTreeSet.add("Jack");
        System.out.println(stringTreeSet);

        Set<String> stringLinkedHashSet = new LinkedHashSet<>();
        stringLinkedHashSet.add("John");
        stringLinkedHashSet.add("Jim");
        stringLinkedHashSet.add("Jack");
        stringLinkedHashSet.add("Jack");
        System.out.println(stringLinkedHashSet);
    }
}
