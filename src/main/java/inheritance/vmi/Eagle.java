package inheritance.vmi;

public class Eagle extends Animal implements Flyable {

    public Eagle(){
        super.name = "Bird";
    }

    @Override
    public void feed() {
        System.out.println("Eagle, add meat!!!");
    }

    @Override
    public void fly(){
        System.out.println("Eagle Fly");
    }
}
