package de.schulung.entwurfsmuster.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Roboter {

    private final List<Command> executedCommands;

    public Roboter() {
        this.executedCommands = new ArrayList<>();
    }

    public void dreheLinks() {
        final Command links = new DreheLinksCommand();
        links.execute();
        this.executedCommands.add(links);
    }

    public void dreheLinks(int x) {
        final MakroCommand makroCommand = new MakroCommand();
        for (int i = 0; i < x; i++) {
            makroCommand.getCommands().add(new DreheLinksCommand());
        }
        makroCommand.execute();
        this.executedCommands.add(makroCommand);
    }

    public void dreheRechts(int x) {
        final MakroCommand makroCommand = new MakroCommand();
        for (int i = 0; i < x; i++) {
            makroCommand.getCommands().add(new DreheRechtsCommand());
        }
        makroCommand.execute();
        this.executedCommands.add(makroCommand);
    }

    public void dreheRechts() {
        final Command rechts = new DreheRechtsCommand();
        rechts.execute();
        this.executedCommands.add(rechts);
    }

    public void undoCommands() {
        this.executedCommands.forEach(Command::undo);
        this.executedCommands.clear();
    }

}
