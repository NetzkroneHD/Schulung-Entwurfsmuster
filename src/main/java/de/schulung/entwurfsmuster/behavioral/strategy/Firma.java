package de.schulung.entwurfsmuster.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class Firma {

    private final List<Arbeiter> mitarbeiter;

    public Firma() {
        this.mitarbeiter = new ArrayList<>();
    }

    public void einstellen(Arbeiter einzustellenderArbeiter) {
        this.mitarbeiter.add(einzustellenderArbeiter);
    }

    public void produzieren() {
        this.mitarbeiter.forEach(Arbeiter::arbeiten);
    }

}
