package de.schulung.entwurfsmuster.structual.proxy;

public class Client {

    private final Database database;

    public Client(Database database) {
        this.database = database;
    }

    public String getClientData(String id) {
        return database.getData(id);
    }

}
