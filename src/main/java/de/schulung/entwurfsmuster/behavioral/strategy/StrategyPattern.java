package de.schulung.entwurfsmuster.behavioral.strategy;

public class StrategyPattern {

    public static void run() {

        final Arbeiter elektriker = new Elektriker();
        final Arbeiter maler = new Maler();
        final Arbeiter schreiner = new Schreiner();

        final Firma firma = new Firma();

        firma.einstellen(elektriker);
        firma.einstellen(maler);
        firma.einstellen(schreiner);

        firma.produzieren();
    }

}
