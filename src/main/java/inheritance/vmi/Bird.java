package inheritance.vmi;

public class Bird extends Animal implements Flyable {

    String name = "bird";

    @Override
    public void feed() {
        System.out.println("Bird, add seed!!!");
    }

    public void fly(){
        System.out.println("Bird Fly");
    }
}
