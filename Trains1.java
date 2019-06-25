package com.company;

import java.util.Scanner;
import java.lang.String;

public class Trains1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You have a distance of 10 kms and first train can turn to another path on the 4-th kilometer ");
        System.out.println("Input a speed of the first train: ");
        double V1 = scanner.nextDouble();

        System.out.println("Input a speed of the second train: ");
        double V2 = scanner.nextDouble();

        double dist = 10;
        //double dist1 = dist - 4; // Train can turn on 4-th kilometers

        double T1 = dist / V1; //dist1
        double T2 = dist / V2;

        double S1 = V1 * T1;
        double S2 = V2 * T2;

        System.out.println(S1);
        System.out.println(S2);

        System.out.println("Trains " + (isTrainsComeAcross(S1, S2) ? "don't " : "to ") + "come across.");

    }

    public static boolean isTrainsComeAcross(double S1, double S2) {
        return (S2 >= 6); // Выходит 10 - 4 = 6, где 10-дистанция, а 4- дистанция, на которой может свернуть 1 поезд
        //return true;
        //else
        //return false;
    }
}

