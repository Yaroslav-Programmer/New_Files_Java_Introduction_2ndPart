package com.company;

import java.util.Scanner;
import java.lang.String;

public class MaxArray {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = fillArray();

        int max = findMax(array);

        print(array);

    }

    private static int[] fillArray() {
        System.out.println("Input array size");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input elements of array: " + i);
            arr[i] = scanner.nextInt();

        }
        return arr;
    }


    private static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];

        }
        System.out.println("Max value: " + max);
        return max;

    }

    private static int[] print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        return arr;
    }
}

