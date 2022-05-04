package com.mond.gofdesignpattern.proxy.after;

public class Client {
    public static void main(String[] args) {
//        GameService gameService = new DontTouchGameServiceProxy();
//        GameService gameService = new GameServiceProxy(new DefaultGameService());
        GameService gameService = new GameServiceProxy();
        gameService.gameStart();
    }
}
