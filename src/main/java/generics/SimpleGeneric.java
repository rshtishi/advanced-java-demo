package generics;

public class SimpleGeneric<T,U> {

    private T attribute1 = null;
    private U attribute2 = null;
    private  String attribute3= null;

    public SimpleGeneric(T param1, U param2, String param3) {

        this.attribute1 = param1;
        this.attribute2 = param2;
        this.attribute3 = param3;
    }

    public void printType() {
        System.out.println("Type: " + attribute1.getClass().getName());
        System.out.println("Type: " + attribute2.getClass().getName());
        System.out.println("Type: " + attribute3.getClass().getName());
    }
}
