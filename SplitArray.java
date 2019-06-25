package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

public class SplitArray {
    public static void main(String[] args) {

        int[] arr0 = new int[20];
        int n = arr0.length;

        fillArray(arr0);

        int[] arr1 = new int[(n + 1) / 2];
        int[] arr2 = new int[n - arr1.length];

        System.arraycopy(arr0, 0, arr1, 0, arr1.length); // сopy arr0 to arr1
        System.arraycopy(arr0, arr1.length, arr2, 0, arr2.length); // сopy arr0 to arr2

        //System.out.println("First part of array -- > " + "arr1: " + Arrays.toString(arr1));
        System.out.println("Second part of array --> " + "arr2: " + Arrays.toString(arr2));
    }

    public static int[] fillArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Input elements of array: " + i);
            array[i] = scanner.nextInt();
        }
        return array;
    }
}