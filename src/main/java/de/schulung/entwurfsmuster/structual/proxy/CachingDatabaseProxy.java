package de.schulung.entwurfsmuster.structual.proxy;

import java.util.HashMap;
import java.util.Map;

public class CachingDatabaseProxy extends Database {

    private final Database database;
    private final Map<String, String> cache;

    public CachingDatabaseProxy(Database database) {
        this.database = database;
        this.cache = new HashMap<>();
    }

    @Override
    public String getData(String id) {
        final String cachedData = this.cache.get(id);
        if (cachedData != null) {
            System.out.println("Getting cached data "+id);
            return cachedData;
        }
        final String data = database.getData(id);
        this.cache.put(id, data);
        return data;
    }
}
