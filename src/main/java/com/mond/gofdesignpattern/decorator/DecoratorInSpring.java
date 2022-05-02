package com.mond.gofdesignpattern.decorator;

import org.springframework.beans.factory.xml.BeanDefinitionDecorator;
import org.springframework.http.server.reactive.ServerHttpRequestDecorator;
import org.springframework.http.server.reactive.ServerHttpResponseDecorator;

public class DecoratorInSpring {
    public static void main(String[] args) {
        // 빈 설정 데코레이터
        BeanDefinitionDecorator decorator;

        // Webflux Http 요청 / 응답 decorator
        ServerHttpRequestDecorator serverHttpRequestDecorator;
        ServerHttpResponseDecorator serverHttpResponseDecorator;
    }
}
