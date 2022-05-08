package com.mond.gofdesignpattern.abstractfactory.after;

import com.mond.gofdesignpattern.abstractfactory.before.WhiteAnchor;
import com.mond.gofdesignpattern.abstractfactory.before.WhiteWheel;

// 일련의 규약을 지키는 제품을 만드는 Factory가 되는 것
public class WhiteShipPartsFactory implements ShipPartsFactory {
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
