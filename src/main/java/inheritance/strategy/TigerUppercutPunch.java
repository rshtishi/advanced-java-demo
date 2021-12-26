package inheritance.strategy;

public class TigerUppercutPunch implements Punch {

    @Override
    public void executePunch() {
        System.out.println("Tiger uppercut punch");
    }
}
