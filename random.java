package com.company;

import java.util.Scanner;
import java.lang.String;

public class random {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 10 + 1);
        int userNum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("DEBUG: number = " + number);

        System.out.println("Input the number between 1 and 10: ");

        while (true) {
            userNum = scanner.nextInt();
            if (number == userNum) {
                System.out.println("Yeah, you guessed");
                break;
            }
            System.out.println("The number " +
                    ((userNum > number) ? "less" : "greater") + " than you typed.");
        }
    }
}
/*

for(int i = 0; i <100; i++){
  System.out.println("Thank you very much");
}
 */
