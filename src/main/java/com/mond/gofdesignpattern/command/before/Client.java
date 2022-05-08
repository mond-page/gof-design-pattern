package com.mond.gofdesignpattern.command.before;

public class Client {
    public static void main(String[] args) {
        Button button = new Button(new Light());
        button.press();
        button.press();
        button.press();
        button.press();
    }
}
