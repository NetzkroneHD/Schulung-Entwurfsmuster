package de.schulung.entwurfsmuster.behavioral.visitor;

public class VersicherungsVisitor extends Visitor {

    @Override
    public void visit(Bus bus) {
        System.out.println("Bus ist versichert.");
    }

    @Override
    public void visit(Lkw lkw) {
        System.out.println("Lkw ist versichert.");

    }
}
