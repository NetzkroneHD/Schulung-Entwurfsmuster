package de.schulung.entwurfsmuster.structual.decorator;

public class DecoratorPattern {

    public static void run() {

        final Book book = new Book("Ich", "Mein Buch");
        book.read();

        final BorrowableDecorator borrowableDecorator = new BorrowableDecorator(book);

        borrowableDecorator.borrow("Du");
        borrowableDecorator.read();
        borrowableDecorator.giveBack();


    }

}
