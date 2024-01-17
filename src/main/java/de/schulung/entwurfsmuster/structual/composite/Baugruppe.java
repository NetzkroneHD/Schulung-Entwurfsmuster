package de.schulung.entwurfsmuster.structual.composite;


import java.util.ArrayList;
import java.util.List;

public class Baugruppe extends Bauteil {

    private final List<Bauteil> bauteile;

    public Baugruppe(String name) {
        super(name, 0);
        this.bauteile = new ArrayList<>();
    }

    public void addBauteil(Bauteil bauteil) {
        this.bauteile.add(bauteil);
    }

    @Override
    public int getPrice() {
        int sum = 0;
        for (Bauteil bauteil : this.bauteile) {
            sum += bauteil.getPrice();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Baugruppe{" +
                "bauteile=" + bauteile + " " +
                "price=" + getPrice() +
                '}';
    }
}
