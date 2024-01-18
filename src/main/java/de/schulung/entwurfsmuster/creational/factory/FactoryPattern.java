package de.schulung.entwurfsmuster.creational.factory;

public class FactoryPattern {

    public static void run() {

        final IkeaFiliale filialeWitten = new IkeaFiliale("Witten");
        final IkeaFiliale filialeDortmund = new IkeaFiliale("Dortmund");

        final Moebel moebelAusWitten = filialeWitten.verkaufen();
        final Moebel moebelAusDortmund = filialeDortmund.verkaufen();

        moebelAusWitten.montieren();
        moebelAusWitten.benutzen();

        moebelAusDortmund.montieren();
        moebelAusDortmund.benutzen();

        System.out.println("Witten: "+filialeWitten.getFilialUmsatz());
        System.out.println("Dortmund: "+filialeDortmund.getFilialUmsatz());
        System.out.println("Konzern: "+IkeaFiliale.getKonzerUmsatz());


    }

}
