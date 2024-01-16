package de.schulung.entwurfsmuster.behavioral.visitor;

public class ReinigungsVisitor extends Visitor {


    @Override
    public void visit(Bus bus) {
        System.out.println("Bus ist sauber.");
    }

    @Override
    public void visit(Lkw lkw) {
        System.out.println("Lkw ist sauber.");
    }
}
