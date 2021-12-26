package inheritance.vmi;

public class VmiExample {

    public static void main(String[] args){
        feed(new Cow());
        feed(new Bird());
        feed(new Lion());
    }

    public static void feed(Animal animal){
        animal.printName();
        animal.feed();
        System.out.println();
    }
}
