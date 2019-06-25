package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.String;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty())
                break;
            list.add(s);
        }
        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    private static void sort(String[] array) {
        sortInt(array);
        sortString(array);
    }

    private static void sortInt(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                for (int j = 0; j < array.length; j++) {
                    if (isNumber(array[j])) {
                        int a = Integer.parseInt(array[i]);
                        int b = Integer.parseInt(array[j]);

                        if (b < a) {
                            String temp = array[i];
                            array[i] = array[j];
                            array[j] = temp;
                        }
                    }
                }
            }
        }
    }

    private static void sortString(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (!isNumber(array[i])) {
                for (int j = 0; j < array.length; j++) {
                    if (!isNumber(array[j])) {
                        String a = Character.toString(array[i].charAt(0));
                        String b = Character.toString(array[j].charAt(0));

                        if (isGreaterThan(b, a)) {
                            String temp = array[i];
                            array[i] = array[j];
                            array[j] = temp;
                        }
                    }
                }
            }
        }
    }

    private static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }

    private static boolean isNumber(String s) {
        if (s.length() == 0)
            return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-')
                    || (!Character.isDigit(c) && c != '-')) {
                return false;
            }
        }
        return true;
    }
}