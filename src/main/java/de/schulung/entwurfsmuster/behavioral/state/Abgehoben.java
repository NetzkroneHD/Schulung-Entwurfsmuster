package de.schulung.entwurfsmuster.behavioral.state;

public class Abgehoben extends TelefonZustand {

    @Override
    public TelefonZustand auflegen() {
        System.out.println("Aufgelegt");
        return new Aufgelegt();
    }

    @Override
    public TelefonZustand waehlen() {
        System.out.println("Gewählt");
        return new Verbunden();
    }
}
