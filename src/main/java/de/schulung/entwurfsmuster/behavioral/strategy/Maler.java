package de.schulung.entwurfsmuster.behavioral.strategy;

public class Maler extends Arbeiter {

    @Override
    public void arbeiten() {
        System.out.println("Ich male Bilder");
    }
}
