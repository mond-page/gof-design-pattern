package com.mond.gofdesignpattern.abstractfactory.before;

import com.mond.gofdesignpattern.abstractfactory.Ship;
import com.mond.gofdesignpattern.abstractfactory.WhiteShip;

public class WhiteShipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
