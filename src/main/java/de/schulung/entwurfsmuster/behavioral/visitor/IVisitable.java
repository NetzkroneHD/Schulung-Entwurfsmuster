package de.schulung.entwurfsmuster.behavioral.visitor;

public interface IVisitable {

    void accept(Visitor visitor);

}
