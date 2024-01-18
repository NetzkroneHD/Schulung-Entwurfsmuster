package de.schulung.entwurfsmuster.structual.proxy;

public class LoggingDatabaseProxy extends Database {

    private final Database database;

    public LoggingDatabaseProxy(Database database) {
        this.database = database;
    }

    @Override
    public String getData(String id) {
        System.out.println("getting data of "+id);
        return database.getData(id);
    }
}
