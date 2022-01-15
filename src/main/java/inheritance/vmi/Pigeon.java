package inheritance.vmi;

public class Pigeon extends Animal implements Flyable{

    @Override
    public void feed() {
        System.out.println("Eat Bread");
    }

    public void fly(){
        System.out.println("Pigeon Fly");
    }

    public void specialMethod(){
        System.out.println("I am special");
    }
}
