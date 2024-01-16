package de.schulung.entwurfsmuster.behavioral.chainofresponsibility;

public class WeatherSkill implements AlexaSkill {

    @Override
    public boolean canHandle(String task) {
        return task.toLowerCase().contains("weather");
    }

    @Override
    public void handle(String task) {
        System.out.println("It will be sunny.");
    }
}
