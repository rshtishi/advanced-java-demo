package inheritance.vmi;

public class Cow extends Animal {

    public Cow(){
        super.name="Cow";
    }

    @Override
    public void feed() {
        System.out.println("Cow, add hay!!!");
    }
}
