package com.company;
import java.lang.String;
public class Murder {
    public static void main(String[] args) {
        int[] suspects = new int[]{35, 67, 89, 99, 25, 78, 45, 87, 32, 10};
        findCriminal(suspects);
    }

    public static int findCriminal(int[] array) {
        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println("Max value: " + max + " %");
        System.out.println("Index of largest number: " + index);
        return index;
    }
}