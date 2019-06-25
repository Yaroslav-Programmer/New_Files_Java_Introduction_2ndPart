package com.company;

import java.util.Scanner;
import java.lang.String;

public class SwitchCase1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of month: ");
        int month = scanner.nextInt();
        String result = "";
        switch (month) {
            case 1:
            case 2:
            case 12:
                result = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                result = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                result = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                result = "Fall";
                break;
            default:
                System.out.println("Not that number");
        }
        System.out.println(result);
    }

}
