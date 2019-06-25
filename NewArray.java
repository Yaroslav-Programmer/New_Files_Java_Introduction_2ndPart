package com.company;

import java.util.Scanner;
import java.lang.String;

public class NewArray {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = fillArray();
        printReverse(array);


    }

    public static int[] fillArray() {
        System.out.println("Input array size");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input elements of array: " + i);
            arr[i] = scanner.nextInt();

        }
        return arr;
    }


    private static void printReverse(int[] array) {
        System.out.println("---------------");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
        System.out.println("----------------");

    }
}
