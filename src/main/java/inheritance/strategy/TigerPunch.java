package inheritance.strategy;

public class TigerPunch implements Punch {

    @Override
    public void executePunch() {
        System.out.println("Tiger Punch");
    }
}
