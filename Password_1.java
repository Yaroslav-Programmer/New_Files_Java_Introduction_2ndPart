package com.company;
import java.lang.String;
public class Password_1 {
    private static final int MAX_SYMBOLS = 8;
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789_";

    public static void main(String[] args) {
        String generated_password = generatePassword(MAX_SYMBOLS);
        System.out.println("Generated password: " + generated_password);
    }

    private static String generatePassword(int length) {
        String password = "";

        for (int i = 0; i < length; i++) {
            password += randomCharacter(UPPERCASE + LOWERCASE + DIGITS);
        }
        String randomUppercase = randomCharacter(LOWERCASE);
        password = insertAtRandom(password, randomUppercase);
        String randomDigit = randomCharacter(DIGITS);
        password = insertAtRandom(password, randomDigit);


        return password;
    }

    private static String randomCharacter(String characters) {
        int length = characters.length();
        int random = (int) (length * Math.random());
        return characters.substring(random, random + 1);
    }

    private static String insertAtRandom(String string, String toInsert) {
        int length = string.length();
        int random = (int) (length * Math.random());
        return string.substring(0, random) + toInsert + string.substring(length);
    }
}