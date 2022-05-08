package com.mond.gofdesignpattern.command;

import com.mond.gofdesignpattern.command.before.Light;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CommandInJava {

    public static void main(String[] args) {
        Light light = new Light();
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.submit(light::on);
        executorService.submit(light::off);
        executorService.submit(light::on);
        executorService.submit(light::off);
        executorService.shutdown();
    }
}
