package com.mond.gofdesignpattern.proxy.after;

import com.mond.gofdesignpattern.proxy.before.GameService;

// 기존 코드를 전혀 건드릴 수 없을 때 상속받아 해결
public class DontTouchGameServiceProxy extends GameService {

    @Override
    public void startGame() {
        long currentTimeMillis = System.currentTimeMillis();
        super.startGame();
        System.out.println(System.currentTimeMillis() - currentTimeMillis);
    }
}
