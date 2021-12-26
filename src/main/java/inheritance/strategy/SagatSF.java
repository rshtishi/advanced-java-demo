package inheritance.strategy;

public class SagatSF extends Fighter{

    public SagatSF(){
        punches.add(new TigerPunch());
        punches.add(new TigerUppercutPunch());
    }

    @Override
    public void select() {
        System.out.println("Sagat Character Selected!!!");
    }

    @Override
    public void displayStats() {
        System.out.println("Name: Sagat");
        System.out.println("Nationality: Thai");
        System.out.println("Fighting Style: Muay Thai");
    }
}
