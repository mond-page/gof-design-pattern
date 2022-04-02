package com.mond.gofdesignpattern.singleton;

import java.io.Serializable;

public class ThreadSafeSingleton3 implements Serializable {
    private static volatile ThreadSafeSingleton3 instance;

    private ThreadSafeSingleton3() {}

    public static ThreadSafeSingleton3 getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton3.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton3();
                }
            }
        }
        return instance;
    }

    // readResolve() 메소드를 오버라이딩해서 생성자를 새로 만들지 않고 instance를 반환
    protected Object readResolve() {
        return getInstance();
    }
}
