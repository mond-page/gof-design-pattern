package com.mond.gofdesignpattern.proxy.before;

public class GameService {

    public void startGame() {
        System.out.println("start Game");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
