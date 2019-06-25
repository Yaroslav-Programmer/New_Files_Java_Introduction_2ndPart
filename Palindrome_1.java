package com.company;
import java.lang.String;
public class Palindrome_1 {
    private static final String str = "А роза упала на лапу азора";

    public static void main(String[] args) {
        String string = str.replaceAll("\\s+", "");
        string = string.toLowerCase();
        char[] stringArray = string.toCharArray();

        System.out.println("The string \'" + str + "\' is" +
                (isPalindrome(stringArray) ? " " : "not ") +
                "palindrome");
    }

    private static boolean isPalindrome(char[] s) {
        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            if (s[i] != s[j])
                return false;
        }
        return true;
    }
}