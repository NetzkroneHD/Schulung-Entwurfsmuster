package de.schulung.entwurfsmuster.structual.proxy;

import java.util.UUID;

public class Database {

    public String getData(String id) {
        return UUID.randomUUID().toString();
    }

}
