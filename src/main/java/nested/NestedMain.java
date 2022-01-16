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

        System.out.println(outer.callLocalInnerAnonymous(5.0, 1.0));

        Outer.StaticInner staticInner = new Outer.StaticInner();
        staticInner.print();

        System.out.println();

        Course course = new Course();
        course.print();

        System.out.println();
        Company.Receipt receipt = new Company("OSHE").new Receipt(45);
        receipt.print();

        //Book book =
        Book.Builder builder = new Book.Builder("Mizantrop", "Balzak")
                .isbn("454545");
        Book book1 = builder.genre("Classic").build();

        Book book = new Book.Builder("","").build();

        Book book2 = new Book.Builder("Metamorfoza", "Franz Kafka").build();

        Book book3 = new Book.Builder("Huaji", "Albert Kamy")
                .published("2020").build();

        System.out.println();
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

    }

}
