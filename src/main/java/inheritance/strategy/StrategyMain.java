package inheritance.strategy;

public class StrategyMain {

    public static void main(String[] args){
        SagatSF sagat = new SagatSF();
        RyuSF ryu = new RyuSF();

        sagat.executeComboPunch();
        ryu.executeComboPunch();
    }
}
