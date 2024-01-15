package de.schulung.entwurfsmuster.templatemethod;

public class TemplateMethod {

    public static void run() {

        final Game game = new NumberGuessingGame();

        game.play();

    }

}
