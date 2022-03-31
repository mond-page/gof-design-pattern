package com.mond.gofdesignpattern.singleton;

public class ThreadSafeSingleton2 {
    private static final ThreadSafeSingleton2 INSTANCE = new ThreadSafeSingleton2();

    private ThreadSafeSingleton2() {}

    public static ThreadSafeSingleton2 getInstance() {
        return INSTANCE;
    }
}
