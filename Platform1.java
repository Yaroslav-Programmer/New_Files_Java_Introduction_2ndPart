package com.company;
import java.util.Scanner;
import java.lang.String;
public class Platform1 {
    private static final int LENGTH = 1;
    private static final int WIDTH = 1;
    private static final int MAX_WEIGHT = 1000;

    public static void main(String[] args) {

        System.out.println("Enter the box parameters in METERS: (W, L, H):");
        Scanner scanner = new Scanner(System.in);
        int boxWidth = scanner.nextInt();
        int boxLength = scanner.nextInt();
        int boxHeight = scanner.nextInt();

        System.out.println("Enter the box weight (kg):");
        int boxWeight = scanner.nextInt();

        System.out.println(
                "The box " + (
                        isOverload(boxLength, boxWidth, boxHeight, boxWeight) ?
                                "can " : "cannot ")
                        + "be lifted.");
    }

    public static boolean isOverload(int l, int w, int h, int weight ) {
        return (
                l <= LENGTH && l <= WIDTH &&
                        w <= LENGTH && w <= WIDTH &&
                        h <= LENGTH && h <= WIDTH &&
                        weight <= MAX_WEIGHT
        );
    }
}
