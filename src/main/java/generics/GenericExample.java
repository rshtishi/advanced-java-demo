package generics;



import java.io.File;
import java.util.Arrays;

public class GenericExample {

    public static void main(String[] args) {

        CustomList<String> list = new CustomList<>(String.class,5);
        list.add("4");
        list.add("3");
        list.print();

        //SimpleGenericMethod Examle
        System.out.println("  Simple Generic method");
        simpleGenericMethod("Rando");
        simpleGenericMethod(new Object());
        simpleGenericMethod(new File(""));

        String[] strs = { "a","b","c"};
        printGenericArray(strs);
        Integer[] nums = {1,2,3};
        printGenericArray(nums);

        //SimpleGeneric Example
        System.out.println("\n  SimpleGeneric class");
        SimpleGeneric<String> stringGeneric = new SimpleGeneric<>("Rando");
        stringGeneric.printType();
        SimpleGeneric<Object> objectGeneric = new SimpleGeneric<>(new Object());
        objectGeneric.printType();
        SimpleGeneric<File> fileGeneric = new SimpleGeneric<>(new File(""));
        fileGeneric.printType();

        //Bounded Type Parameters in methods
        System.out.println("\n  Bounded Type Paramter in methods");
        System.out.println("Max:" + findMaximum(new Integer(1), new Integer(2)));
        System.out.println("Max:" + findMaximum("Rando", "Shtishi"));

        //Bounded Type Parameter in class
        System.out.println("\n  Bounded Type Parameter in classes");
        BoundedGeneric<PaypalPayment> paypalBoundedGeneric = new BoundedGeneric<>(new PaypalPayment());
        paypalBoundedGeneric.execute();
        BoundedGeneric<StripePayment> stripeBoundedGeneric = new BoundedGeneric<>(new StripePayment());
        stripeBoundedGeneric.execute();

        //Multiple Bounds for Type Parameters in methods
        System.out.println("\n  Multiple Bounded Type Parameters in methods");
        System.out.println("Max: " + findMaximum(1, 2, 3));
        System.out.println("Max: " + findMaximum(1.5, 2.5, 3.5));

        //Multiple Bounds for Type Parameters in classes
        System.out.println("\n Multiple Bounded Type Parameters in classes");
        MultipleBoundedGeneric<CreditCardPayment> ccMultipleBoundedGeneric = new MultipleBoundedGeneric<CreditCardPayment>(new CreditCardPayment());
        ccMultipleBoundedGeneric.execute();

        //Wildcards
        System.out.println("\n WildCards");
        SimpleGeneric<Object> wildCardEx1 = new SimpleGeneric<>(new String());  //correct
        SimpleGeneric<String> wildCardEx2 = new SimpleGeneric<>(new String());  //correct
        //SimpleGeneric<Object> wildCardEx3 = wildCardEx2;  //Incorrect
        SimpleGeneric<?> wildCardEx3 = wildCardEx1;
        wildCardEx3 = wildCardEx2;

    }

    public static <T,U> void simpleGenericMethod(T param) {
        System.out.println("Type: " + param.getClass().getName());
    }

    public static <T> void printGenericArray(T[] array){
        for(T t:array){
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


}
