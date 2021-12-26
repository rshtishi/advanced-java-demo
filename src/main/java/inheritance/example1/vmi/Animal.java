package inheritance.example1.vmi;

public abstract class Animal {

    String name = "???";

    public abstract void feed();

    public void printName() {
        System.out.println(name);
    }
}
