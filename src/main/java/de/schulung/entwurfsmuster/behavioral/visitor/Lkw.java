package de.schulung.entwurfsmuster.behavioral.visitor;

public class Lkw implements IVisitable {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
