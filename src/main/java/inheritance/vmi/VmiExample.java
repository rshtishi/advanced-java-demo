package inheritance.vmi;

public class VmiExample {

    public static void main(String[] args){
        feed(new Cow());
        feed(new Bird());
        feed(new Lion());

        System.out.println();

        fly(new Bird());
        fly(new Pigeon());
    }

    public static void feed(Animal animal){
        animal.printName();
        animal.feed();
        System.out.println();
    }


    public static void fly(Flyable flyable){
        flyable.fly();
        if(flyable instanceof Pigeon){
            Pigeon pigeon = (Pigeon) flyable;
            pigeon.specialMethod();
        }
    }


}
