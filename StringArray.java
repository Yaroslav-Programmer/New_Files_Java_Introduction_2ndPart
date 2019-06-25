package com.company;

import java.util.Scanner;
import java.lang.String;

public class StringArray {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] arr = fillArray();
        print(arr);

    }

    private static String[] fillArray() {
        System.out.println("Input array size");
        int size = scanner.nextInt();
        String [] arr = new String[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input elements of array: " + i);
            arr [i] = scanner.nextLine();

        }
        return arr;
    }

    private static void print(String[] array) {
        System.out.println("---------------");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("----------------");

    }
}