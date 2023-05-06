package collections;

import java.util.*;

public class ListExample {

    public static void main(String[] args){

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Rando"));
        personList.add(new Person("Roland"));
        personList.add(new Person("Misen"));
        personList.remove(new Person("Rando"));



        Iterator<Person> personIterator = personList.listIterator();
        while(personIterator.hasNext()){
            System.out.println(personIterator.next());
        }

        personList.remove(new Person("rando"));
        System.out.println("\n");
        for(Person person: personList){
            System.out.println(person);
        }

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(3);

        System.out.println(integerList);
        integerList.remove(2);
        System.out.println(integerList);

        List<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.addAll(integerList);
        integerLinkedList.add(4);
        integerLinkedList.add(5);

        System.out.println(integerLinkedList);
        System.out.println(integerLinkedList.containsAll(integerList));
        System.out.println(integerLinkedList.contains(4));

        Iterator<Integer> iterator = integerLinkedList.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        List<String> stringList = Arrays.asList("John","Jim");
        System.out.println(stringList);
    }
}
