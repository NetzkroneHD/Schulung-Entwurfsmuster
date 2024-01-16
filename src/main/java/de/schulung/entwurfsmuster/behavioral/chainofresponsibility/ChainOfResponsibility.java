package de.schulung.entwurfsmuster.behavioral.chainofresponsibility;

public class ChainOfResponsibility {

    public static void run() {

        final AlexaSkill musicSkill = new MusicSkill();
        final AlexaSkill smartHomeSkill = new SmartHomeSkill();
        final AlexaSkill weatherSkill = new WeatherSkill();

        final Alexa alexa = new Alexa();
        alexa.addSkill(musicSkill);
        alexa.addSkill(smartHomeSkill);
        alexa.addSkill(weatherSkill);

        alexa.handle("Play Music!");
        alexa.handle("How is the Weather?");
        alexa.handle("Turn off the Lights!");
        alexa.handle("dfask");

    }

}
