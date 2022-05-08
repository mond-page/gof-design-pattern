package com.mond.gofdesignpattern.command.after;

import java.util.Stack;

public class Button {

    private Stack<Command> commands;

    public Button() {
        commands = new Stack<>();
    }

    public void press(Command command) {
        command.execute();
        commands.push(command);
    }

    public void undo() {
        if (!commands.isEmpty()) {
            commands.pop().undo();
        }
    }
}
