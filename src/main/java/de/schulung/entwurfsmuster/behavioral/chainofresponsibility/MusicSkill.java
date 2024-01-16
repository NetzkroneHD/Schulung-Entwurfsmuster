package de.schulung.entwurfsmuster.behavioral.chainofresponsibility;

public class MusicSkill implements AlexaSkill {

    @Override
    public boolean canHandle(String task) {
        return task.toLowerCase().contains("music");
    }

    @Override
    public void handle(String task) {
        System.out.println("Oompa Loompa doom-pa-dee-do");
    }
}
