package dev.haguel.patterns.singleton;

import dev.haguel.patterns.singleton.pattern.Logger;
import dev.haguel.patterns.util.Generator;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        Stream.generate(Generator::generateRandomString)
                .limit(20)
                .toList()
                .forEach(logger::log);

        logger.showLogs();
        System.out.println("===== First iteration end =====");

        logger = Logger.getInstance();
        logger.showLogs();
        System.out.println("===== Second iteration end =====");
    }
}
