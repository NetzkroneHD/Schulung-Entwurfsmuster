package de.schulung.entwurfsmuster.behavioral.observer;

import lombok.Data;

@Data
public class Beobachter {

    private final String name;

    public Beobachter(String name) {
        this.name = name;
    }

    public void onAktienkursChanged(AktienkursChangedEvent aktienkursChangedEvent) {
        if (aktienkursChangedEvent.getAlterKurs() < aktienkursChangedEvent.getNeuerKurs()) {
            System.out.println(name+" verkauft!");
        } else {
            System.out.println(name+" kauft!");
        }
    }


}
