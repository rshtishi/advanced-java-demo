package generics;

import java.io.File;
import java.util.Comparator;

public class GenericExample {

    public static void main(String[] args) {

        //SimpleGenericMethod Examle
        simpleGenericMethod("Rando");
        simpleGenericMethod(new Object());
        simpleGenericMethod(new File(""));

        //SimpleGeneric Example
        SimpleGeneric<String> stringGeneric = new SimpleGeneric<>("Rando");
        stringGeneric.printType();

        SimpleGeneric<Object> objectGeneric = new SimpleGeneric<>(new Object());
        objectGeneric.printType();

        SimpleGeneric<File> fileGeneric = new SimpleGeneric<>(new File(""));
        fileGeneric.printType();

        //Bounded Type Parameters
        System.out.println("Max:" + findMaximum(new Integer(1), new Integer(2)));
        System.out.println("Max:" + findMaximum("Rando", "Shtishi"));

    }

    public static <T> void simpleGenericMethod(T param) {
        System.out.println("Type: " + param.getClass().getName());
    }

    public static <T extends Comparable<T>> T findMaximum(T a, T b) {
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }
        return a.compareTo(b) > 0 ? a : b;
    }


}
