package com.company;

import java.lang.String;

public class MinArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int min = arr[0];

        for (int i : arr){
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}