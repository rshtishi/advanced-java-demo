package nested;

public class NestedMain {

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.callInner();

        System.out.println();

        Outer.Inner inner = outer.new Inner();
        inner.go();

        System.out.println(outer.calculate(2));
    }
}
