package com.mond.gofdesignpattern.abstractfactory.after;

import com.mond.gofdesignpattern.abstractfactory.Ship;
import com.mond.gofdesignpattern.abstractfactory.ShipFactory;
import com.mond.gofdesignpattern.abstractfactory.WhiteShip;

public class WhiteShipFactory implements ShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());

        return ship;
    }
}
