package de.schulung.entwurfsmuster.behavioral.visitor;

public class Bus implements IVisitable {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
