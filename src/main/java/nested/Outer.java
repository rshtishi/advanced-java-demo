package nested;

public class Outer {

    private String greeting = "hey";

    public class Inner {

        public int repeat = 3;

        public void go() {
            for (int i = 0; i < repeat; i++) {
                System.out.println(greeting);
            }
        }
    }

    public static class StaticInner {

        String name = "Rando";

        public void print() {
            String greeting = (new Outer()).greeting;
            System.out.println(greeting + " " + name);
        }
    }

    public void callInner() {
        Inner inner = new Inner();
        inner.go();
    }

    public int callLocalInner(int exp) {
        int base = 5;
        class LocalInner {
            public int power() {
                int value = 1;
                for (int i = 0; i < exp; i++) {
                    value *= base;
                }
                return value;
            }
        }
        LocalInner localInner = new LocalInner();
        return localInner.power();
    }

    public double callLocalInnerAnonymous(double price, double feeAmount) {
        Fee fee = new Fee() {
            @Override
            public double apply(double amount) {
                return price + amount;
            }
        };
        return fee.apply(feeAmount);
    }

    public String getGreeting(){
        return greeting;
    }


}
