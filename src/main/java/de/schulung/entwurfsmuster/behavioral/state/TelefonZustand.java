package de.schulung.entwurfsmuster.behavioral.state;

public class TelefonZustand {

    public TelefonZustand abheben() {
        throw new IllegalStateException();
    }

    public TelefonZustand anrufAnnehmen() {
        throw new IllegalStateException();
    }

    public TelefonZustand auflegen() {
        throw new IllegalStateException();
    }

    public TelefonZustand sprechen() {
        throw new IllegalStateException();
    }

    public TelefonZustand waehlen() {
        throw new IllegalStateException();
    }

}
