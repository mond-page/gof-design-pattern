package com.mond.gofdesignpattern.abstractfactory;

public interface ShipPartsFactory {

    Anchor createAnchor();
    Wheel createWheel();

}
