package com.mond.gofdesignpattern.proxy.after;

public class DefaultGameService implements GameService{
    @Override
    public void gameStart() {
        System.out.println("start Game");
    }
}
