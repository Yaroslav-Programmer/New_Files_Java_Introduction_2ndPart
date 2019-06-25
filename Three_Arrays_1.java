package com.company;

import java.util.Scanner;
import java.lang.String;

public class Three_Arrays_1 {
    private static final int MAX = 20;
    private static final int SMALL_ARRAY_MAX = 10;

    public static void main(String[] args) {
        int[] whole_array = new int[MAX];
        int[] small_array_1 = new int[SMALL_ARRAY_MAX];
        int[] small_array_2 = new int[SMALL_ARRAY_MAX];

        fillArray(whole_array);
        copyArray(whole_array, small_array_1, small_array_2);
        printElementsOfArray_2(small_array_2, SMALL_ARRAY_MAX);

    }

    private static void fillArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Input elements of array: " + i);
            array[i] = scanner.nextInt();
        }
    }

    private static void copyArray(int[] array, int[] small_array_1, int[] small_array_2) {
        for (int i = 0; i < SMALL_ARRAY_MAX; i++) {
            small_array_1[i] = array[i];
            small_array_2[i] = array[i + SMALL_ARRAY_MAX];
        }
    }

    private static void printElementsOfArray_2(int[] array, int size_of_array) {
        for (int i = 0; i < size_of_array; i++) {
            System.out.println("Elements of the second array: " + array[i]);
        }
    }
}