package com.company;
import java.util.Scanner;
import java.lang.String;
public class Trains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a speed of the first train: ");
        int V1 = scanner.nextInt();
        System.out.println("Input a speed of the second train: ");
        int V2 = scanner.nextInt();

        int dist = 0;
        while (dist <= 10){
            System.out.println(dist + " kms");
            dist ++ ;
            if(dist == 4){
                System.out.println("Do you want that the train turn to the spare way? 1- No, 2- Yes");
                int a1 = scanner.nextInt();
                if (a1 == 1){
                    System.out.println("Trains crashes ");
                    break;
                }else if (a1 == 2){
                    System.out.println("Trains don`t crash");
                }else{
                    System.out.println("Not that number");
                    break;
                }
            }
        }
    }
        }