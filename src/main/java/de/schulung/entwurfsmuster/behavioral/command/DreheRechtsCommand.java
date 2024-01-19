package de.schulung.entwurfsmuster.behavioral.command;

public class DreheRechtsCommand extends Command {


    @Override
    public void execute() {
        System.out.println("Drehe Rechts");
    }

    @Override
    public void undo() {
        System.out.println("Undo -> Drehe Links");
    }
}
