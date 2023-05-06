package inheritance.vmi;

public class VmiExample {

    public static void main(String[] args){

        Animal[] animals = new Animal[]{new Cow(),new Eagle(),new Lion()};
        feed(animals);
        feed(new Cow());
        System.out.println();

        fly(new Eagle());
        fly(new Pigeon());
    }

    public static void feed(Animal[] animals){
        for(Animal animal: animals){
            animal.printName();
            animal.feed();
        }
        System.out.println("-----------");
    }

    public static void feed(Animal animal){
        animal.printName();
        animal.feed();
    }


    public static void fly(Flyable flyable){
        flyable.fly();
        if(flyable instanceof Pigeon){
            Pigeon pigeon = (Pigeon) flyable;
            pigeon.specialMethod();
        }
    }


}
