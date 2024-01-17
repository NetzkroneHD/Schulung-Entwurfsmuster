package de.schulung.entwurfsmuster.structual.composite;

public class CompositePattern {

    public static void run() {

        final Baugruppe baugruppe = new Baugruppe("Flugzeug");
        final Baugruppe fluegel = new Baugruppe("Flügel");

        fluegel.addBauteil(new Bauteil("Rechter Flügel", 100));
        fluegel.addBauteil(new Bauteil("Linker Flügel", 100));

        baugruppe.addBauteil(new Bauteil("Propeller", 15));
        baugruppe.addBauteil(new Bauteil("Heckflosse", 50));

        baugruppe.addBauteil(fluegel);

        System.out.println("Preis der Flügel: "+fluegel.getPrice());
        System.out.println("Gesamter Preis: "+baugruppe.getPrice());


    }

}
