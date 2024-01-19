package de.schulung.entwurfsmuster.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class MakroCommand extends Command {

    private final List<Command> commands;

    public MakroCommand() {
        this.commands = new ArrayList<>();
    }

    @Override
    public void execute() {
        this.commands.forEach(Command::execute);
    }

    @Override
    public void undo() {
        for (int i = this.commands.size() - 1; i >= 0; i--) {
            this.getCommands().get(i).undo();
        }
    }

    public List<Command> getCommands() {
        return commands;
    }
}
