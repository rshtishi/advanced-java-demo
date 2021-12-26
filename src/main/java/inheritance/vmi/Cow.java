package inheritance.vmi;

public class Cow extends Animal {

    String name = "cow";

    @Override
    public void feed() {
        System.out.println("Cow, add hay!!!");
    }
}
