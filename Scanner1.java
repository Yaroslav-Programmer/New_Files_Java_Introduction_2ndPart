package com.company;
import java.util.Scanner;
import java.lang.String;
public class Scanner1 {
    public static void main(String[] args) {
        System.out.println("Input first number: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        System.out.println("Input second number: ");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();

        System.out.println("Input third number: ");
        Scanner scanner1 = new Scanner(System.in);
        int c = scanner1.nextInt();

        if (c != 0){
            System.out.println("Result is: " + (a + b) / c);
        }else{
            System.out.println("ERROR! C can`t be 0. ");
        }

    }
}
