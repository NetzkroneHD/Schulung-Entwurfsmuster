package de.schulung.entwurfsmuster.behavioral.command;

public class CommandPattern {

    public static void run() {

        final Roboter roboter = new Roboter();

        roboter.dreheLinks(2);
        roboter.dreheRechts();
        roboter.dreheLinks();

        roboter.undoCommands();

    }

}
