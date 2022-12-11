package nested;

import java.time.LocalDateTime;

public class NestedMain {


    public static void main(String[] args) {

        Outer outer = new Outer();
        Outer.Inner inner = new Outer().new Inner();
        inner.go();
        outer.callInner();

        Outer.StaticInner staticInner = new Outer.StaticInner();
        staticInner.print();

        System.out.println(outer.callLocalInner(3));

        Flyable flyable = new Flyable() {
            @Override
            public void fly() {
                System.out.println("Pigeon fly");
            }
        };

        flyable.fly();

        Fee fee = new Fee() {
            @Override
            public double apply(double amount) {
                amount = amount - (amount * 0.2);
                return amount;
            }
        };
        System.out.println(fee.apply(10));
        System.out.println(outer.callLocalInnerAnonymous(5.0, 1.0));


        Course course = new Course();
        course.register("Greta","A");
        course.register("Klest","A");
        course.register("Ikmet","A");
        course.register("Kevin","A");
        course.register("Elvian","A");
        course.register("Krisel","A");
        course.print();

        Book book = new Book.Builder("3 shoket","Remark")
                .description("Best book ever")
                .isbn("454545")
                .build();
        System.out.println(book);

        /*

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

        System.out.println();
        Salary salary = new Salary();
        System.out.println(salary.calculateTaxes());

        Event event = new Event() {

            @Override
            public void schedule(String name) {
                System.out.println(name+ " is scheduled "+ LocalDateTime.now());
            }
        };

        event.schedule("Java Advanced");

        System.out.println();

        System.out.println();



        flyable.fly();

        System.out.println();
        System.out.println();

        Button button1 = new Button();
        Button button2 = new Button();

        button1.click(new Action(){
            @Override
            public void execute() {
                for(int i=0;i<5;i++){
                    System.out.print(" * ");
                }
            }
        });
        System.out.println("\n");
        button2.click(new Action(){

            @Override
            public void execute() {
                for(int i=0;i<5;i++){
                    for(int j=0;j<5;j++){
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
            }
        });
        */


    }

}
