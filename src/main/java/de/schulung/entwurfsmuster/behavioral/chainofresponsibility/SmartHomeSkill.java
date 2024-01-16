package de.schulung.entwurfsmuster.behavioral.chainofresponsibility;

public class SmartHomeSkill implements AlexaSkill {

    @Override
    public boolean canHandle(String task) {
        return task.toLowerCase().contains("light");
    }

    @Override
    public void handle(String task) {
        System.out.println("The lights are now turned on.");
    }
}
