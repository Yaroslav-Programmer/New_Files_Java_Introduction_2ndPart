package com.company;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.String;
import java.util.ArrayList;

public class Solution1 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    private static void sort(String[] array) {
        String st = null;
        int num1 = Integer.MIN_VALUE;
        int num2 = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (isGreaterThen(array[j], array[i])) {
                    if (!isNumber(array[i])) {
                        st = array[i];
                        array[i] = array[j];
                        array[j] = st;
                    }
                }

                if (isNumber(array[i]) && isNumber(array[j])) {
                    num1 = Integer.parseInt(array[i]);
                    num2 = Integer.parseInt(array[j]);
                    if (num1 > num2) {
                        st = array[j];
                        array[j] = array[i];
                        array[i] = st;
                    }
                }
            }
        }
    }

    private static boolean isGreaterThen(String a, String b) {
        return a.compareTo(b) > 0;
    }

    private static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c) && c != '-') return false;
        }
        return true;
    }
}