package generics;

import java.io.File;

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
    }

    public static <T> void simpleGenericMethod(T param) {
        System.out.println("Type: " +param.getClass().getName());
    }
}
