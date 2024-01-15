package de.schulung.entwurfsmuster.state;

public class StatePattern {

    public static void run() {

        //Happy path
        System.out.println("Happy path:");

        final Telefon telefon = new Telefon();
        telefon.abheben();
        telefon.waehlen();
        telefon.sprechen();
        telefon.sprechen();
        telefon.auflegen();

        telefon.anrufAnnehmen();
        telefon.auflegen();

        System.out.println();
        //Unhappy path
        System.out.println("Unhappy path:");

        try {
            telefon.auflegen();
        } catch (IllegalStateException ex) {
            System.out.println("Erwartet: "+ex);
        }

    }

}
