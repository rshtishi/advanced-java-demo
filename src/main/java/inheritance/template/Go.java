package inheritance.template;

public class Go extends Game {

    @Override
    void initialize() {
        System.out.println("Go Game Initialized");
    }

    @Override
    void start() {
        System.out.println("Go Game Started.");
    }

    @Override
    void end() {
        System.out.println("Go Game Ended.");
    }
}
