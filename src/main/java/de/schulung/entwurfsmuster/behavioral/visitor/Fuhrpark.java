package de.schulung.entwurfsmuster.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Fuhrpark {

    private final List<IVisitable> fahrzeuge;

    public Fuhrpark() {
        this.fahrzeuge = new ArrayList<>();
    }

    public void acceptVisitor(Visitor visitor) {
        fahrzeuge.forEach(visitable -> visitable.accept(visitor));
    }

    public void addFahrzeug(IVisitable visitable) {
        this.fahrzeuge.add(visitable);
    }

}
