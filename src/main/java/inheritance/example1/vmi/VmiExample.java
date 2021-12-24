package inheritance.example1.vmi;

public class VmiExample {

    public static void main(String[] args){
        feed(new Cow());
        feed(new Bird());
        feed(new Lion());
    }

    public static void feed(Animal animal){
        animal.feed();
    }
}
