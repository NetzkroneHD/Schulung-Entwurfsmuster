package de.schulung.entwurfsmuster.behavioral.templatemethod;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame extends Game {


    private int randomNumber;
    private int guess;

    @Override
    public void initGame() {
        this.randomNumber = new Random().nextInt(100);
    }

    @Override
    public void getInput() {
        System.out.println("Gib eine Zahl von 0 bis 100 an ("+this.randomNumber+"):");
        final Scanner inputScanner = new Scanner(System.in);
        this.guess = inputScanner.nextInt();
    }

    @Override
    public boolean isGameOver() {
        return guess == randomNumber;
    }

    @Override
    public void updateGame() {
        if (guess > randomNumber) {
            System.out.println("Die Zahl ist zu groß.");
        } else if (guess < randomNumber) {
            System.out.println("Die Zahl ist zu klein.");
        }
    }

    @Override
    public void showWinner() {
        System.out.println("Du hast gewonnen! :D");
    }
}
