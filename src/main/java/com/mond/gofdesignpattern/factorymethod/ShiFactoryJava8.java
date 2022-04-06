package com.mond.gofdesignpattern.factorymethod;

public interface ShiFactoryJava8 {

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
