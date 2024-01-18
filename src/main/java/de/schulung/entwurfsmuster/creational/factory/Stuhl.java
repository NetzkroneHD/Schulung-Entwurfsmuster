package de.schulung.entwurfsmuster.creational.factory;

public class Stuhl extends Moebel {

    public Stuhl(String name, int preis) {
        super(name, preis);
    }

    @Override
    public void montieren() {
        System.out.println("Stuhl hingestellt");
    }

    @Override
    public void benutzen() {
        System.out.println("Hinsetzen");
    }
}
