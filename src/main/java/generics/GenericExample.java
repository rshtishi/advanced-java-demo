package generics;

import java.io.File;

public class GenericExample {

    public static void main(String[] args) {

        //SimpleGenericMethod Examle
        System.out.println("  Simple Generic method");
        simpleGenericMethod("Rando");
        simpleGenericMethod(new Object());
        simpleGenericMethod(new File(""));

        //SimpleGeneric Example
        System.out.println("\n  SimpleGeneric class");
        SimpleGeneric<String> stringGeneric = new SimpleGeneric<>("Rando");
        stringGeneric.printType();
        SimpleGeneric<Object> objectGeneric = new SimpleGeneric<>(new Object());
        objectGeneric.printType();
        SimpleGeneric<File> fileGeneric = new SimpleGeneric<>(new File(""));
        fileGeneric.printType();

        //Bounded Type Parameters in methods
        System.out.println("\n  Bounded Type Paramters in methods");
        System.out.println("Max:" + findMaximum(new Integer(1), new Integer(2)));
        System.out.println("Max:" + findMaximum("Rando", "Shtishi"));

        //Bounded Type Parameter in class
        System.out.println("\n  Bounded Type Parameters in classes");
        BoundedGeneric<PaypalPayment> paypalBoundedGeneric = new BoundedGeneric<>(new PaypalPayment());
        paypalBoundedGeneric.execute();
        BoundedGeneric<StripePayment> stripeBoundedGeneric = new BoundedGeneric<>(new StripePayment());
        stripeBoundedGeneric.execute();

        //Multiple Bounds for Type Parameter

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
