package de.schulung.entwurfsmuster.behavioral.observer;

public class ObserverPattern {

    public static void run() {

        final Aktie aktie = new Aktie(100);

        aktie.addBeobachter(new Beobachter("Tim"));
        aktie.addBeobachter(new Beobachter("Tom"));

        aktie.updateKurs(50);
        aktie.updateKurs(100);
        aktie.updateKurs(100);

    }

}
