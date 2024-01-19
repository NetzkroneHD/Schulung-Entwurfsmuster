package de.schulung.entwurfsmuster.behavioral.command;

public class DreheLinksCommand extends Command {


    @Override
    public void execute() {
        System.out.println("Drehe Links");
    }

    @Override
    public void undo() {
        System.out.println("Undo -> Drehe Rechts");
    }
}
