package de.schulung.entwurfsmuster.behavioral.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;


public class Alexa {

    private final List<AlexaSkill> skills;

    public Alexa() {
        this.skills = new ArrayList<>();
    }

    public void handle(String task) {
        this.skills.stream()
                .filter(alexaSkill -> alexaSkill.canHandle(task))
                .findAny()
                .ifPresentOrElse(
                        alexaSkill -> alexaSkill.handle(task),
                        () -> System.out.println("I did not understand you.")
                );
    }

    public void addSkill(AlexaSkill skillToAdd) {
        this.skills.add(skillToAdd);
    }

    public List<AlexaSkill> getSkills() {
        return skills;
    }
}
