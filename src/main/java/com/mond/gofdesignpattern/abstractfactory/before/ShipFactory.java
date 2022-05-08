package com.mond.gofdesignpattern.abstractfactory.before;

import com.mond.gofdesignpattern.abstractfactory.Ship;

public interface ShipFactory {

    default Ship orderShip(String name, String email) {
        validate(name,  email);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email);

        return ship;
    }

    Ship createShip();

    void validate(String name, String email);

    void prepareFor(String name);

    void sendEmailTo(String email);

}
