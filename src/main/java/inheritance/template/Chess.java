package inheritance.template;

public class Chess extends Game {

    @Override
    void initialize() {
        System.out.println("Chess Game Initialized.");
    }

    @Override
    void start() {
        System.out.println("Chess Game Started.");
    }

    @Override
    void end() {
        System.out.println("Chess Game Ended.");
    }
}
