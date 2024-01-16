package de.schulung.entwurfsmuster.behavioral.strategy;

public class Elektriker extends Arbeiter {

    @Override
    public void arbeiten() {
        System.out.println("Ich mache Kurzschlüsse");
    }
}
