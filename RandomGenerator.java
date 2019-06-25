package com.company;

import java.util.Random;
import java.lang.String;

public class RandomGenerator {
    private static int QUANTITY_OF_CREATURES = 103;
    private static Random random = new Random();
    public static void main(String[] args) {
        for (int i = 0; i < QUANTITY_OF_CREATURES; i++) {
            creatures();
        }
    }

    private static void creatures() {
        char [] a = {'М', 'Ж', 'В', 'О'};
        System.out.println("Element: " + a[random.nextInt(a.length)]);
    }
}