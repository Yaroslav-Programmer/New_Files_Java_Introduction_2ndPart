package com.company;

import java.util.Random;
import java.util.Scanner;
import java.lang.String;

public class Random_Func {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Input size of an array: ");
        //int size = scanner.nextInt();
        System.out.println("Input min value: ");
        int min = scanner.nextInt();
        System.out.println("Input max value: ");
        int max = scanner.nextInt();

        System.out.println("Random value in range: " + (random.nextInt(max - min) + min));

        fillArray(array,min, max);
    }

    public static int[] fillArray(int[] size,int min, int max) {
        Random random = new Random();
        int [] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] = random.nextInt((max - min) + min));
        }

        return array;
    }
}
