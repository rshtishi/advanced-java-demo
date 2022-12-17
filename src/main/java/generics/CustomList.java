package generics;

import java.lang.reflect.Array;

public class CustomList<T> {

    private int index =0;
    private T[] array;

    public CustomList(Class<T> clazz,int size){

        array = (T[]) Array.newInstance(clazz, size); //new T[5]
    }

    public void add(T t){
        if(t==null){
            throw new IllegalArgumentException("Null elements not allowed");
        }
        array[index]=t;
        index++;
    }

    public void print(){
        for(T t:array){
            System.out.println(t);
        }
    }
}
