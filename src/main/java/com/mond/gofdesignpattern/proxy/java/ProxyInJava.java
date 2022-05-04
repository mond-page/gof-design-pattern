package com.mond.gofdesignpattern.proxy.java;

import com.mond.gofdesignpattern.proxy.after.DefaultGameService;
import com.mond.gofdesignpattern.proxy.after.GameService;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInJava {
    public static void main(String[] args) {
        ProxyInJava proxyInJava = new ProxyInJava();
        proxyInJava.dynamicProxy();
    }

    private void dynamicProxy() {
        GameService gameServiceProxy = getGameServiceProxy(new DefaultGameService());
        gameServiceProxy.gameStart();
    }

    // dynamic proxy
    private GameService getGameServiceProxy(GameService target) {
        return (GameService) Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[]{GameService.class}, (new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("hello dynamic proxy start");
                        method.invoke(target, args);
                        System.out.println("hello dynamic proxy end");
                        return null;
                    }
                }));
    }
}
