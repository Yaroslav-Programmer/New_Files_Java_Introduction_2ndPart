package com.company;

import java.util.Scanner;

public class Trains_1 {
    private static final double DISTANCE = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the first train's speed: ");
        double V1 = scanner.nextDouble();

        System.out.println("Input the second train's speed: ");
        double V2 = scanner.nextDouble();

        isTrainComeAcross(V1, V2);
    }

    public static boolean isTrainComeAcross(double V1, double V2) {
        boolean a = DISTANCE / (V1 + V2) * V1 >= 4;
        System.out.println(a);
        return a;
    }
}
