package inheritance.vmi;

public class Lion extends Animal {

    public Lion(){
        super.name = "Lion";
    }

    @Override
    public void feed() {
        System.out.println("Lion, add meat!!!");
    }

}
