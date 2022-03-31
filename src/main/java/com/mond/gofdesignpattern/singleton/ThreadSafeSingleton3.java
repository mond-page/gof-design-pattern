package com.mond.gofdesignpattern.singleton;

public class ThreadSafeSingleton3 {
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
}
