package com.mond.gofdesignpattern.factorymethod;

// Java 8 버전 이하의 예제코드
public abstract class DefaultShipFactoryJava8 implements ShiFactoryJava8 {

    @Override
    public void validate(String name, String email) {
        if (name == null) {
            throw new IllegalArgumentException("이름을 적어주세요.");
        }
        if (email == null) {
            throw new IllegalArgumentException("이메일을 적어주세요.");
        }
    }

    @Override
    public void prepareFor(String name) {
        System.out.println(name + "만들 준비 중");
    }

    @Override
    public void sendEmailTo(String email) {
        System.out.println(email + "발송 완료");
    }

}
