package com.company;

import java.util.Scanner;
import java.lang.String;

public class Platform {
    private static final int LENGTH_OF_THE_PLATFORM = 1;
    private static final int WIDTH_OF_THE_PLATFORM = 1;
    private static final int MAX_WEIGHT = 1000; // or 1 ton

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You have a platform 1 in 1 size and load capacity of 1000 kg");

        System.out.println("Input a height of your box(in metres): ");
        int boxHeight = scanner.nextInt();

        System.out.println("Input a length of your box(in metres): ");
        int boxLength = scanner.nextInt();

        System.out.println("Input a width of your box(in metres): ");
        int boxWidth = scanner.nextInt();

        System.out.println("Input a weight of your box(in kgs): ");
        int boxWeight = scanner.nextInt();

        boolean lifted = isBoxLifted(boxLength, boxWidth, boxHeight, boxWeight);
        if (lifted) {
            System.out.println("Box can be lifted");
        } else {
            System.out.println("Box can't be lifted");
        }
    }

    public static boolean isBoxLifted(int length, int width, int height, int weight) {
        return (length <= LENGTH_OF_THE_PLATFORM && width <= WIDTH_OF_THE_PLATFORM && weight <= MAX_WEIGHT);
    }
}


