package inheritance.template;

public class TemplateMain {

    public static void main(String[] args) {

        Game chessGame = new Chess();
        Game goGame = new Go();

        chessGame.play();
        goGame.play();
    }
}
