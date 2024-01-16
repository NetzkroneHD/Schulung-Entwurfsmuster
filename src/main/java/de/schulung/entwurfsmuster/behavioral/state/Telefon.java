package de.schulung.entwurfsmuster.behavioral.state;

public class Telefon {

    private TelefonZustand aktuellerZustand = new Aufgelegt();

    public void abheben() {
        this.aktuellerZustand = aktuellerZustand.abheben();
    }

    public void anrufAnnehmen() {
        this.aktuellerZustand = aktuellerZustand.anrufAnnehmen();
    }

    public void auflegen() {
        this.aktuellerZustand = aktuellerZustand.auflegen();
    }

    public void sprechen() {
        this.aktuellerZustand = aktuellerZustand.sprechen();
    }

    public void waehlen() {
        this.aktuellerZustand = aktuellerZustand.waehlen();
    }


}
