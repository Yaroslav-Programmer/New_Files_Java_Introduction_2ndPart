package com.company;

import java.util.Random;
import java.lang.String;

public class Rugby_Players {
    private static final int MAX_QUANTITY_OF_PLAYERS = 25;

    public static void main(String[] args) {
        players();
    }

    public static int players() {
        int[] first_team = new int[MAX_QUANTITY_OF_PLAYERS];
        int[] second_team = new int[MAX_QUANTITY_OF_PLAYERS];

        int sum_1 = 0;
        int sum_2 = 0;

        Random randomGenerator = new Random();
        for (int i = 0; i < MAX_QUANTITY_OF_PLAYERS; i++) {
            first_team[i] = randomGenerator.nextInt(MAX_QUANTITY_OF_PLAYERS) + 1;
            second_team[i] = randomGenerator.nextInt(MAX_QUANTITY_OF_PLAYERS) + 1;

            sum_1 += first_team[i];
            sum_2 += second_team[i];


            System.out.println("The age of the first team one player: " + first_team[i]);
            System.out.println("The age of the second team one player: " + second_team[i]);

        }
        int average_1 = sum_1 / MAX_QUANTITY_OF_PLAYERS;
        int average_2 = sum_2 / MAX_QUANTITY_OF_PLAYERS;
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Average age in first team: " + average_1);
        System.out.println("Average age in second team: " + average_2);
        System.out.println("-------------------------------------------------------------------");

        if (average_1 > average_2) {
            System.out.println("Average age of the first team is bigger than in the second team");
        } else if (sum_2 > sum_1) {
            System.out.println("Average age of the second team is bigger than in the first team");
        } else {
            System.out.println("Average age of the first and second teams are equal");
        }
        System.out.println("-------------------------------------------------------------------");
        //System.out.println("The largest average: " + ((sum_1 < sum_2) ? "sum_1" : "sum_2"));
        return average_1 & average_2;
    }
}
