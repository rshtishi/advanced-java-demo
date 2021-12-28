package generics;

import java.io.File;

public class GenericExample {

    public static void main(String[] args){
        //SimpleGeneric Example
        SimpleGeneric<String> stringGeneric = new SimpleGeneric<>("Rando");
        stringGeneric.printType();

        SimpleGeneric<Object>  objectGeneric = new SimpleGeneric<>(new Object());
        objectGeneric.printType();

        SimpleGeneric<File> fileGeneric = new SimpleGeneric<>(new File(""));
        fileGeneric.printType();


    }
}
