package de.schulung.entwurfsmuster.creational.factory;

import lombok.Data;

import java.util.Random;

@Data
public class IkeaFiliale {

    private static int KONZER_UMSATZ = 0;

    private String standort;
    private int filialUmsatz;

    public IkeaFiliale(String standort) {
        this.standort = standort;
        this.filialUmsatz = 0;
    }

    public Moebel verkaufen() {
        final int type = new Random().nextInt(3);
        Moebel moebel;
        if (type == 0) {
            moebel = new Tisch("Kleiner Tisch", 50);
        } else if (type == 1) {
            moebel = new Stuhl("Großer Stuhl", 25);
        } else {
            moebel = new Schrank("Kleider Schrank", 100);
        }
        this.filialUmsatz += moebel.getPreis();
        KONZER_UMSATZ += moebel.getPreis();
        return moebel;
    }

    public static int getKonzerUmsatz() {
        return KONZER_UMSATZ;
    }
}
