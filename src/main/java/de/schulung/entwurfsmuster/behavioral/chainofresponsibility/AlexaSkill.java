package de.schulung.entwurfsmuster.behavioral.chainofresponsibility;

public interface AlexaSkill {

    boolean canHandle(String task);
    void handle(String task);

}
