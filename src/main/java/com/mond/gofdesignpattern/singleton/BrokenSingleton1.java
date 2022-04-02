package com.mond.gofdesignpattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BrokenSingleton1 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        ThreadSafeSingleton3 threadSafeSingleton = ThreadSafeSingleton3.getInstance();

        Constructor<ThreadSafeSingleton3> constructor = ThreadSafeSingleton3.class.getDeclaredConstructor();
        constructor.setAccessible(true);    // private constructor 접근
        ThreadSafeSingleton3 newThreadSingleton = constructor.newInstance();

        System.out.println(threadSafeSingleton == newThreadSingleton);

    }
}
