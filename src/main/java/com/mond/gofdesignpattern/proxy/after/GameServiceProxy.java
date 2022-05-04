package com.mond.gofdesignpattern.proxy.after;

public class GameServiceProxy implements GameService{

    private GameService gameService;

//    public GameServiceProxy(DefaultGameService defaultGameService) {
//        this.gameService = defaultGameService;
//    }

    @Override
    public void gameStart() {
        long currentTimeMillis = System.currentTimeMillis();
        if (gameService == null) {
            gameService = new DefaultGameService();
        }
        gameService.gameStart();
        System.out.println(System.currentTimeMillis() - currentTimeMillis);
    }
}
