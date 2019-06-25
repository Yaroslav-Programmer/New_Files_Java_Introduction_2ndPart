package com.company;

import java.util.Random;
import java.util.Scanner;
import java.lang.String;

public class Random_Func_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size of an array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Input min value: ");
        int min = scanner.nextInt();

        System.out.println("Input max value: ");
        int max = scanner.nextInt();

        fillArray(array, min, max);
    }

    public static int[] fillArray(int[] array, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min) + min;
            System.out.println("Random value in range: " + array[i]);
        }
        return array;
    }
}
