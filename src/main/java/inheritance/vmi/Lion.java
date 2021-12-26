package inheritance.vmi;

public class Lion extends Animal {

    String name = "lion";

    @Override
    public void feed() {
        System.out.println("Lion, add meat!!!");
    }

}
