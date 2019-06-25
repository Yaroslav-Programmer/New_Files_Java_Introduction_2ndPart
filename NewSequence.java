package com.company;
import java.lang.String;
public class NewSequence {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        isIncreasing(array);
    }

    private static boolean isIncreasing(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                System.out.println("This sequence is not increasing");
                return false;
            }
        }
        System.out.println("This sequence is increasing");
        return true;
    }
}