package inheritance.strategy;

public class DragonKick implements Kick{

    @Override
    public void executeKick(){
        System.out.println("Dragon Kick");
    }
}
