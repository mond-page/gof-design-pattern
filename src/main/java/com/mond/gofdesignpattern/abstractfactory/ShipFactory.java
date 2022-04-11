package com.mond.gofdesignpattern.abstractfactory;

public interface ShipFactory {

    default Ship orderShip(String name, String email) {
        validate(name,  email);
        prepareFor(name);
        Ship ship = createShip();
        sendEmailTo(email);

        return ship;
    }

    Ship createShip();

    private void validate(String name, String email) {
        if (name == null) {
            throw new IllegalArgumentException("이름을 적어주세요.");
        }
        if (email == null) {
            throw new IllegalArgumentException("이메일을 적어주세요.");
        }
    }

    private void prepareFor(String name) {
        System.out.println(name + "만들 준비 중");
    }

    private void sendEmailTo(String email) {
        System.out.println(email + "발송 완료");
    }

}
