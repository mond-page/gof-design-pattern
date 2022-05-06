package com.mond.gofdesignpattern.chainofresponsibility.before;

public class AuthRequestHandler extends RequestHandler{

    @Override
    public void handler(Request request) {
        System.out.println("인증이 되었나");
        System.out.println("사용이 처리할만한 유저인가");
        super.handler(request);
    }
}
