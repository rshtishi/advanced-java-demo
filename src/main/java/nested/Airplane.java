package nested;

public class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Airplane Fly");
    }

    public void fill(){
        System.out.println("Fill Fuel");
    }
}
