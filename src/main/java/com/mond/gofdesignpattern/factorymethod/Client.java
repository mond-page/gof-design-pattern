package com.mond.gofdesignpattern.factorymethod;

public class Client {

    public static void main(String[] args) {

        Client client = new Client();
        client.print(new WhiteShipFactory(), "Lee", "lee@gmail.com");
        client.print(new BlackShipFactory(), "Kim", "kim@gmail.com");

    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }

}
