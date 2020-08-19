package net.zaurbeck;

import java.math.BigInteger;
import java.security.SecureRandom;

public class Helper {
    private static SecureRandom random = new SecureRandom();

    public static String generateRandomString() {
        return new BigInteger(130, random).toString(36);
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}