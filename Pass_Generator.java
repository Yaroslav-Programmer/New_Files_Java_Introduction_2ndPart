package com.company;

import java.util.Random;
import java.lang.String;

public class Pass_Generator {
    private static final Random random = new Random();
    private static final int MAX_SYMBOLS = 8;

    public static void main(String[] args) {
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789_";

        passGeneration(lowercase);
        chars(uppercase);
    }

    private static char passGeneration(String low_letters) {
        int x = 0;
        for (int i = 0; i < MAX_SYMBOLS; i++) {
            int index = random.nextInt(low_letters.length());
            x = index;

        }
        System.out.println(low_letters.charAt(x));
        return low_letters.charAt(x);
    }

    private static char chars(String up_letters) {
        int y = 0;
        for (int i = 0; i < MAX_SYMBOLS; i++) {
            int index = random.nextInt(up_letters.length());
            y = index;
            return up_letters.charAt(y);
        }
        System.out.println(up_letters.charAt(y));
        return up_letters.charAt(y);
    }
}