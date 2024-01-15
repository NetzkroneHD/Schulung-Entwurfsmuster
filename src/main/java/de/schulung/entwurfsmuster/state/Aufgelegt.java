package de.schulung.entwurfsmuster.state;

public class Aufgelegt extends TelefonZustand {

    @Override
    public TelefonZustand abheben() {
        System.out.println("Abgehoben");
        return new Abgehoben();
    }

    @Override
    public TelefonZustand anrufAnnehmen() {
        System.out.println("Anruf angenommen");
        return new Verbunden();
    }
}
