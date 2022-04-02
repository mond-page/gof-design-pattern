package com.mond.gofdesignpattern.singleton;

import java.io.*;

public class BrokenSingleton2 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ThreadSafeSingleton3 threadSafeSingleton = ThreadSafeSingleton3.getInstance();
        Object newThreadSafeSingleton;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("threadSafeSingleton.obj"))) {
            out.writeObject(threadSafeSingleton);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("threadSafeSingleton.obj"))) {
            newThreadSafeSingleton = in.readObject();
        }

        System.out.println(threadSafeSingleton == newThreadSafeSingleton);

    }
}
