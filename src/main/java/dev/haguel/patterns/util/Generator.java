package dev.haguel.patterns.util;

import java.util.Random;

public class Generator {
    private static final Random random = new Random();

    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder result = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            result.append(characters.charAt(random.nextInt(characters.length())));
        }

        return result.toString();
    }

    public static String generateRandomString() {
        int length = random.nextInt(19) + 1;

        return generateRandomString(length);
    }
}