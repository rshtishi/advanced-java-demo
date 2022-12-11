package nested;


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
        course.register("Greta", "A");
        course.register("Klest", "A");
        course.register("Ikmet", "A");
        course.register("Kevin", "A");
        course.register("Elvian", "A");
        course.register("Krisel", "A");
        course.print();

        Book book = new Book.Builder("3 shoket", "Remark")
                .description("Best book ever")
                .isbn("454545")
                .build();
        System.out.println(book);

        Salary salary = new Salary(1000);
        System.out.println(salary.calculateTaxes());

        Button button = new Button();
        button.click(new HelloAction());
        button.click(new Action(){
            @Override
            public void execute() {
                System.out.println("Hello from anonym class object");
            }
        });

        button.click(new Action() {
            @Override
            public void execute() {
                for(int i=0;i<5;i++)
                {
                    for(int j=0;j<5;j++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
        });


    }

}
