package com.mond.gofdesignpattern.singleton;

public class ThreadSafeSingleton4 {

    private ThreadSafeSingleton4() {}

    private static class ThreadSafeSingleton4Holder {
        private static final ThreadSafeSingleton4 INSTANCE = new ThreadSafeSingleton4();
    }

    public static ThreadSafeSingleton4 getInstance() {
        return ThreadSafeSingleton4Holder.INSTANCE;
    }
}
