package de.schulung.entwurfsmuster.creational.factory;

import lombok.Data;

@Data
public abstract class Moebel {

    private String name;
    private int preis;

    public Moebel(String name, int preis) {
        this.name = name;
        this.preis = preis;
    }

    public abstract void montieren();

    public abstract void benutzen();

}
