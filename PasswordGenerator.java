package com.company;

import java.security.SecureRandom;
import java.lang.String;
import java.util.Random;

public class PasswordGenerator {
    private static final int MAX_SYMBOLS = 8;
    private static final Random random = new SecureRandom();
    private static final StringBuilder password = new StringBuilder();
    private static final char[] LOWERCASE = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] UPPERCASE = "ABCDEFGJKLMNPRSTUVWXYZ".toCharArray();
    private static final char[] DIGITS = "0123456789_".toCharArray();
    private static final char[] allAllowed = "abcdefghijklmnopqrstuvwxyzABCDEFGJKLMNPRSTUVWXYZ0123456789_".toCharArray();

    private static String generatePassword(int length) {
        for (int i = 0; i < length - 3; i++) {
            password.append(allAllowed[random.nextInt(allAllowed.length)]);
        }
        password.insert(random.nextInt(password.length()), LOWERCASE[random.nextInt(LOWERCASE.length)]);
        password.insert(random.nextInt(password.length()), UPPERCASE[random.nextInt(UPPERCASE.length)]);
        password.insert(random.nextInt(password.length()), DIGITS[random.nextInt(DIGITS.length)]);

        return password.toString();
    }

    public static void main(String[] args) {
        System.out.println("Your generated password: " + generatePassword(MAX_SYMBOLS));
    }
}