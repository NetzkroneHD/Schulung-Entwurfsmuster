package de.schulung.entwurfsmuster.behavioral.state;

public class Verbunden extends TelefonZustand {


    @Override
    public TelefonZustand auflegen() {
        System.out.println("Aufgelegt");
        return new Aufgelegt();
    }

    @Override
    public TelefonZustand sprechen() {
        System.out.println("Weiter sprechen");
        return this;
    }
}
