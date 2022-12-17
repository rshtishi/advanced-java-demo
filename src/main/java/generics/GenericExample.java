package generics;


import inheritance.override.Person;

import java.io.File;
import java.util.Arrays;

public class GenericExample {

    public static void main(String[] args) {

        //SimpleGenericMethod Examle
        System.out.println("  Simple Generic method");
        simpleGenericMethod("Rando");
        simpleGenericMethod(new Object());
        simpleGenericMethod(new File(""));

        String[] strs = {"a", "b", "c"};
        printGenericArray(strs);
        Integer[] nums = {1, 2, 3};
        printGenericArray(nums);

        //Bounded Type Parameters in methods
        System.out.println("\n  Bounded Type Paramter in methods");
        System.out.println("Max:" + findMaximum(new Integer(1), new Integer(2)));
        System.out.println("Max:" + findMaximum("Rando", "Shtishi"));

        //Multiple Bounds for Type Parameters in methods
        System.out.println("\n  Multiple Bounded Type Parameters in methods");
        System.out.println("Max: " + findMaximum(1, 2, 3));
        System.out.println("Max: " + findMaximum(1.5, 2.5, 3.5));
        System.out.println("Max: " + findMaximum(new Integer[]{1, 5, 6, 9}));
        System.out.println("Max: " + findMaximum(new Byte[]{1, 5, 6, 9}));

        //SimpleGeneric Example
        System.out.println("\n  SimpleGeneric class");
        SimpleGeneric<String,String> stringGeneric = new SimpleGeneric<>("Rando","Shtishi","30");
        stringGeneric.printType(); // String String String
        SimpleGeneric<String,Integer> objectGeneric = new SimpleGeneric<>("String",30,"String");
        objectGeneric.printType(); // String Integer String
        SimpleGeneric<File,Exception> fileGeneric = new SimpleGeneric<>(new File(""),new Exception(),"");
        fileGeneric.printType();  // File Exception String

        CustomList<String> list = new CustomList<>(String.class, 5);
        list.add("4");
        list.add("3");
        list.print();

        //Bounded Type Parameter in class
        System.out.println("\n  Bounded Type Parameter in classes");
        BoundedGeneric<PaypalPayment> paypalBoundedGeneric = new BoundedGeneric<>(new PaypalPayment());
        paypalBoundedGeneric.execute();
        BoundedGeneric<StripePayment> stripeBoundedGeneric = new BoundedGeneric<>(new StripePayment());
        stripeBoundedGeneric.execute();

        FileConverter<XMLConverter> xmlConverter = new FileConverter<>(new XMLConverter());
        xmlConverter.execute();
        FileConverter<PDFConverter> pdfConverter = new FileConverter<>(new PDFConverter());
        pdfConverter.execute();



        //Multiple Bounds for Type Parameters in classes
        System.out.println("\n Multiple Bounded Type Parameters in classes");
        MultipleBoundedGeneric<CreditCardPayment> ccMultipleBoundedGeneric = new MultipleBoundedGeneric<CreditCardPayment>(new CreditCardPayment());
        ccMultipleBoundedGeneric.execute();

        //Wildcards
        System.out.println("\n WildCards");
        SimpleGeneric<Object,String> wildCardEx1 = new SimpleGeneric<>(new String(), new String(),new String());  //correct
        SimpleGeneric<String,Object> wildCardEx2 = new SimpleGeneric<>(new String(), new String(), new String());  //correct
        //SimpleGeneric<Object> wildCardEx3 = wildCardEx2;  //Incorrect
        SimpleGeneric<?,?> wildCardEx3 = wildCardEx1;
        wildCardEx3 = wildCardEx2;

    }

    public static <T> void simpleGenericMethod(T param) {
        System.out.println("Type: " + param.getClass().getName());
    }

    public static <T> void printGenericArray(T[] array) {
        for (T t : array) {
            System.out.println(t);
        }
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

    public static <T extends Number & Comparable<T>> T findMaximum(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static <T extends Number & Comparable<T>> T findMaximum(T[] table) {
        T max = table[0];
        for (int index = 1; index < table.length; index++) {
            if (max.compareTo(table[index]) < 0) {
                max = table[index];
            }
        }
        return max;
    }


}
