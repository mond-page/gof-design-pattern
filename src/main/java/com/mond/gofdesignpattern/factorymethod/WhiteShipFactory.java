package com.mond.gofdesignpattern.factorymethod;

public class WhiteShipFactory implements ShipFactory {

    // 특화되어 있는 공정은 WhiteShip에서 다했음
    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
