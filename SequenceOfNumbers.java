package com.company;
import java.lang.String;
public class SequenceOfNumbers {
    private static final int LENGTH_OF_ARRAY = 10;

    public static void main(String[] args) {
        int[] array = {LENGTH_OF_ARRAY};
        isSequence(array);
    }

    private static boolean isSequence(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i + 1 > LENGTH_OF_ARRAY) {
                break;
            }
            if (array[i] < array[i + 1]) {
                System.out.println("This array is increasing");
            } else {
                break;
            }
        }
        return false;
    }
}