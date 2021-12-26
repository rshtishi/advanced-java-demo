package nested;

public class NestedMain {

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.callInner();

        System.out.println();

        Outer.Inner inner = outer.new Inner();
        inner.go();

        System.out.println();

        System.out.println(outer.callLocalInner(2));

        System.out.println();

        System.out.println(outer.callLocalInnerAnonymous(5.0,1.0));

        Outer.StaticInner staticInner = new Outer.StaticInner();
        staticInner.print();

        System.out.println();
    }

    private static class StaticInner {
    }
}
