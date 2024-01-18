package de.schulung.entwurfsmuster.structual.decorator;

import lombok.Data;

@Data
public class Book {

    private String author;
    private String title;

    public Book() {
    }

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public void read() {
        System.out.println("Buch wird gelesen.");
    }

}
