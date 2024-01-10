package org.example.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Invoker {
    public List<Command> getCommands() {
        System.out.println(Arrays.toString(commands.toArray()));
        return commands;
    }

    private final List<Command> commands = new ArrayList<>();

    public void executeOperation(Command command) {
        commands.add(command);
        command.execute();
    }

}
