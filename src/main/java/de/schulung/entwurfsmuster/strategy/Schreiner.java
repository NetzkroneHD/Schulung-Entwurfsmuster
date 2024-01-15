package de.schulung.entwurfsmuster.strategy;

public class Schreiner extends Arbeiter {

    @Override
    public void arbeiten() {
        System.out.println("Ich baue Sachen mit Holz");
    }
}
