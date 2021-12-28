package generics;

public class SimpleGeneric<T> {

    private T attribute = null;

    public SimpleGeneric(T param) {
        this.attribute = param;
    }

    public void printType() {
        System.out.println("Type: " + attribute.getClass().getName());
    }
}
