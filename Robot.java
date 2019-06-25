package com.company;

import java.util.Scanner;
import java.lang.String;

public class Robot {
    private static final int LENGTH_OF_JUMP = 100;
    private static final int HEIGHT_OF_JUMP = 60;
    private static final int HEIGHT_OF_JUMP_IN_LENGTH = 20;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input height of the box: ");
        int height_of_box = scanner.nextInt();

        System.out.println("Input length of the box: ");
        int length_of_box = scanner.nextInt();

        System.out.println("Input height of the second box: ");
        int height_of_second_box = scanner.nextInt();

        System.out.println("Input length of the second box: ");
        int length_of_second_box = scanner.nextInt();

        System.out.println(jump(height_of_box, length_of_box));
        System.out.println(jump(height_of_second_box, length_of_second_box));
    }

    public static boolean jump(int height1, int length1) {
        if (height1 < HEIGHT_OF_JUMP || (length1 < LENGTH_OF_JUMP && height1 < HEIGHT_OF_JUMP_IN_LENGTH)) {
            return true;
        } else
            return false;
    }
}
