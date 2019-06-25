package com.company;

import java.util.Scanner;
import java.lang.String;

public class Main1111 {
    public static void main(String[] args) {

        System.out.println("Input fuel per km : ");
        Scanner scan = new Scanner(System.in);
        double fuel = scan.nextDouble();

        System.out.println("Input distance : ");
        Scanner scanner  = new Scanner(System.in);
        int distance = scanner.nextInt();

        System.out.println("Result: " + consumption(fuel, distance));

    }
    public static double consumption (double car, int km){

        return car * km;
    }
}
