package de.schulung.entwurfsmuster.templatemethod;

public abstract class Game {

    public void play() {
        this.initGame();

        do {
            getInput();
            updateGame();
        } while (!isGameOver());

        showWinner();

    }

    public abstract void initGame();
    public abstract void getInput();
    public abstract boolean isGameOver();
    public abstract void updateGame();
    public abstract void showWinner();

}
