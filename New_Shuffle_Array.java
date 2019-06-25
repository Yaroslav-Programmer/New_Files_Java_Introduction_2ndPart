package com.company;

import java.util.Random;
import java.lang.String;

public class New_Shuffle_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int newIndex = random.nextInt(arr.length);
            int temp = arr[newIndex];
            arr[newIndex] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}