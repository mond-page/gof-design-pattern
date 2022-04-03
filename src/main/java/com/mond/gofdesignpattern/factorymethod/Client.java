package com.mond.gofdesignpattern.factorymethod;

import java.util.Calendar;
import java.util.Locale;

public class Client {

    public static void main(String[] args) {

        Client client = new Client();
        client.print(new WhiteShipFactory(), "Lee", "lee@gmail.com");
        client.print(new BlackShipFactory(), "Kim", "kim@gmail.com");

        Ship whiteShip = new WhiteShipFactory().orderShip("Lee", "lee@gmail.com");
        System.out.println(whiteShip);

        Ship blackShip = new BlackShipFactory().orderShip("kim", "kim@gmail.com");
        System.out.println(blackShip);


        // 단순한 팩톨 ㅣ패턴
        System.out.println(Calendar.getInstance());
        System.out.println(Calendar.getInstance(Locale.ENGLISH));


    }

    // 인터페이스 기반의 코드를 작성해두었기때문에 변경되지 않음.
    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }


}
