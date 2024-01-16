package de.schulung.entwurfsmuster.behavioral.visitor;

public abstract class Visitor {

    public abstract void visit(Bus bus);
    public abstract void visit(Lkw lkw);

}
