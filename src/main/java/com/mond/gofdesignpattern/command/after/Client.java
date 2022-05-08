package com.mond.gofdesignpattern.command.after;

import com.mond.gofdesignpattern.command.before.Light;

public class Client {

    public static void main(String[] args) {
        Button button = new Button();
        button.press(new LightOnCommand(new Light()));
        button.press(new LightOffCommand(new Light()));
        button.undo();
    }
}
