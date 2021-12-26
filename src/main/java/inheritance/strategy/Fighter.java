package inheritance.strategy;

import java.util.ArrayList;
import java.util.List;

public abstract class Fighter {

    protected List<Punch> punches = new ArrayList<>();

    protected List<Kick> kicks = new ArrayList<>();

    public abstract void select();

    public abstract void displayStats();

    public final void executeComboPunch(){
        for(Punch punch: punches){
            punch.executePunch();
        }
    }

    public final void executeComboKick(){
        for(Kick kick: kicks){
            kick.executeKick();
        }
    }

}
