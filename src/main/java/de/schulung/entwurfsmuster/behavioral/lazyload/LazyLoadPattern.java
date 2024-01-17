package de.schulung.entwurfsmuster.behavioral.lazyload;

public class LazyLoadPattern {

    public static void run() {

        final Calculation calculation = new Calculation();

        System.out.println(calculation.calculate());
        System.out.println(calculation.calculate());

    }


}
