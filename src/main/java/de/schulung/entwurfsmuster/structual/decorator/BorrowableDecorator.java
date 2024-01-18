package de.schulung.entwurfsmuster.structual.decorator;

import lombok.Getter;

@Getter
public class BorrowableDecorator extends Book {

    private final Book book;

    public BorrowableDecorator(Book book) {
        super();
        this.book = book;
    }

    public void borrow(String name) {
        System.out.println("Buch wird von "+name+" ausgeliehen.");
    }

    public void giveBack() {
        System.out.println("Buch wird zurück gegeben.");
    }

    @Override
    public void read() {
        this.book.read();
    }

    @Override
    public String getAuthor() {
        return this.book.getAuthor();
    }

    @Override
    public String getTitle() {
        return this.book.getTitle();
    }
}
