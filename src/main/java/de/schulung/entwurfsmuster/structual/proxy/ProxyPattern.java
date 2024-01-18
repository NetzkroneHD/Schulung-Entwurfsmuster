package de.schulung.entwurfsmuster.structual.proxy;

public class ProxyPattern {

    public static void run() {

        final Database database = new Database();
        final LoggingDatabaseProxy loggingDatabase = new LoggingDatabaseProxy(database);
        final CachingDatabaseProxy cachingDatabase = new CachingDatabaseProxy(loggingDatabase);

        final Client client = new Client(cachingDatabase);

        final String firstname = client.getClientData("firstname");
        System.out.println("Firstname: "+firstname);
        System.out.println("Cached Firstname: "+client.getClientData("firstname"));

        final String lastname = client.getClientData("lastname");
        System.out.println("Lastname: "+lastname);
        System.out.println("Cached Lastname: "+client.getClientData("lastname"));



    }

}
