package de.schulung.entwurfsmuster.creational.factory;

public class Tisch extends Moebel {

    public Tisch(String name, int preis) {
        super(name, preis);
    }

    @Override
    public void montieren() {
        System.out.println("Beine aufgestellt");
    }

    @Override
    public void benutzen() {
        System.out.println("Teller platzieren");
    }
}
