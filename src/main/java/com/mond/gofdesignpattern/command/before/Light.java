package com.mond.gofdesignpattern.command.before;

public class Light {

    private boolean isOn;

    public void on() {
        System.out.println("켜졌습니다.");
        this.isOn = true;
    }

    public void off() {
        System.out.println("꺼졌습니다.");
        this.isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }
}
