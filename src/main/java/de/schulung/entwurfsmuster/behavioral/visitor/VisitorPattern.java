package de.schulung.entwurfsmuster.behavioral.visitor;

public class VisitorPattern {

    public static void run() {

        final IVisitable bus = new Bus();
        final IVisitable lkw = new Lkw();

        final Visitor reinigung = new ReinigungsVisitor();
        final Visitor versicherung = new VersicherungsVisitor();

        final Fuhrpark fuhrpark = new Fuhrpark();

        fuhrpark.addFahrzeug(bus);
        fuhrpark.addFahrzeug(lkw);

        fuhrpark.acceptVisitor(reinigung);
        fuhrpark.acceptVisitor(versicherung);

    }

}
