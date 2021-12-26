package nested;

public class Outer {

    private String greeting = "hi";

    public class Inner {

        public int repeat = 3;

        public void go() {
            for (int i = 0; i < repeat; i++) {
                System.out.println(greeting);
            }
        }
    }

    public void callInner() {
        Inner inner = new Inner();
        inner.go();
    }

    public int calculate(int exp) {
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


}
