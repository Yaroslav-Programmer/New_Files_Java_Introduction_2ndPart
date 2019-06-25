package com.company;

import java.lang.String;
public class Pair_Work {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int number = 8;


        System.out.println(contains(arr, number));
    }

    public static boolean contains(int[] array,int number) {

        for (int t : array) {
            if (t == number) {
                System.out.println("Contains 8");
                System.out.println("True");
                return true;
            }
        }
        return false;
    }
}

