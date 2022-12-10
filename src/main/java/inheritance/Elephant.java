package inheritance;

public class Elephant extends HeavyAnimal {

    @Override
    public void feed() {
        System.out.println("Feeding Elephant");
    }

    @Override
    public void healthCheck() {
        System.out.println("Health Check Elephant");
    }
}
