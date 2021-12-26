package inheritance.strategy;

public class DragonPunch implements Punch {

    @Override
    public void executePunch() {
        System.out.println("Dragon Punch");
    }
}
