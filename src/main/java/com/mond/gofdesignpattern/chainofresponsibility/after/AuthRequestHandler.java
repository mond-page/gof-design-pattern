package com.mond.gofdesignpattern.chainofresponsibility.after;

import com.mond.gofdesignpattern.chainofresponsibility.before.Request;

public class AuthRequestHandler extends RequestHandler {

    public AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("인증된 사용자인지 ");
        super.handle(request);
    }
}
