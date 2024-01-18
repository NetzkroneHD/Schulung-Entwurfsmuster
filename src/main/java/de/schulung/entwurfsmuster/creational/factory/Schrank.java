package de.schulung.entwurfsmuster.creational.factory;

public class Schrank extends Moebel {

    public Schrank(String name, int preis) {
        super(name, preis);
    }

    @Override
    public void montieren() {
        System.out.println("An Wand festgemacht");
    }

    @Override
    public void benutzen() {
        System.out.println("Öffnen");
    }
}
