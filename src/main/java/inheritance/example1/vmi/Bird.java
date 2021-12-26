package inheritance.example1.vmi;

public class Bird extends Animal {

    String name = "bird";

    @Override
    public void feed() {
        System.out.println("Bird, add seed!!!");
    }
}
