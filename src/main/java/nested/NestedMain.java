package nested;


public class NestedMain {

    public static void main(String[] args) {

        Parcel parcel = new Parcel(60, 60, 60);
        Validator validator = new ParcelValidator();
        System.out.println(parcel);
        System.out.println(validator.validate(parcel));

        validator = new Validator() {
            @Override
            public boolean validate(Parcel parcel) {
                if (parcel.getxLength() < 30 || parcel.getyLength() < 30 || parcel.getzLength() < 30) {
                    return false;
                }
                if (Integer.sum(Integer.sum(parcel.getxLength(), parcel.getyLength()), parcel.getzLength()) > 300) {
                    return false;
                }
                return true;
            }
        };
        System.out.println(parcel);
        System.out.println(validator.validate(parcel));
        Button button2 = new Button();
        button2.click(new HelloAction());
        Action action = new Action() {

            @Override
            public void execute() {
                System.out.println("Hello I am an anomous class");
            }
        };
        button2.click(action);

        Address address = new Address.Builder()
                .state("Albania")
                .city("Tirana")
                .build();
        System.out.println(address);

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
        button.click(new Action() {
            @Override
            public void execute() {
                System.out.println("Hello from anonym class object");
            }
        });

        button.click(new Action() {
            @Override
            public void execute() {
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }
        });


    }

}
