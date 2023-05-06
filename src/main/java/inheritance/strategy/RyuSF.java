package inheritance.strategy;

public class RyuSF extends Fighter {

    public RyuSF(){
        punches.add(new DragonPunch());
        punches.add(new DragonUppercutPunch());
        kicks.add(new DragonKick());
    }

    @Override
    public void select() {
        System.out.println("Ryu Character Selected!!!");
    }

    @Override
    public void displayStats() {
        System.out.println("Name: Ryu");
        System.out.println("Nationality: Japan");
        System.out.println("Fighting Style: Karate");
    }
}
