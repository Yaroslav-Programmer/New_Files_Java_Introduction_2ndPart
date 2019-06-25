package com.company;
import java.lang.String;
public class Sequence {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        isIncreasing(array);
    }

    private static boolean isIncreasing(int[] arr) {
        for (int i = 1; i < arr.length; i++)
            if (arr[i] <= arr[i - 1]) {
                System.out.println("not");
                return false;
            }
        System.out.println("incr");
        return true;
    }
}