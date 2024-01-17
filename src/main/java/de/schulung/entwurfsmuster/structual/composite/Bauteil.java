package de.schulung.entwurfsmuster.structual.composite;

import lombok.Data;

@Data
public class Bauteil {

    private String name;
    private int price;

    public Bauteil(String name, int price) {
        this.name = name;
        this.price = price;
    }



}
