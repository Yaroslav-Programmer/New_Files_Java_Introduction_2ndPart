package com.company;

import java.util.*;
import java.lang.String;

public class New_Cipher {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int SHIFT = 5;

    public static void main(String[] args) {
        String table_new = "абвгдо1234569-0";
        Encryption(table_new);
    }

    private static char Encryption(String table) {
        System.out.println("Input arbitrary character string: ");
        String string = scanner.nextLine();
        char encrypted_text = ' ';
        for (int i = 0; i < string.length(); i++) {
            char chars = string.charAt(i);
            int index = table.indexOf(chars);
            if (index < 0) {
                System.out.print(chars);
            } else {
                encrypted_text = table.charAt((index + SHIFT) % table.length());
                System.out.print(encrypted_text);
            }
        }
        return encrypted_text;
    }
}