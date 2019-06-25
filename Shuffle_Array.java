package com.company;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.lang.String;

public class Shuffle_Array {

    public static void main(String[] args) {
        int[] array = new int[10];
        shuffleArray(array);
    }

    private static void shuffleArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50 + 1);
        }
        Random rnd = ThreadLocalRandom.current();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);

            // Simple swap
            int a = array[index];
            array[index] = array[i];
            array[i] = a;

            System.out.println(array[i] + " ");
        }

    }
}