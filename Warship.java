package com.company;

import java.lang.String;
import java.util.Scanner;

public class Warship {
    private static final int MAX_ROWS = 10;
    private static final int MIN_ROWS = 1;
    private static final int MAX_COLUMNS = 10;
    private static final int MIN_COLUMNS = 1;
    private static final Scanner scanner = new Scanner(System.in);
    private static final boolean DEBUG = false;

    private static void showBoard(int[][] board) {
        System.out.println("------------------------------------------");
        for (int i = 0; i < board.length; i++) {
            if (DEBUG) {
                for (int j = 0; j < board[0].length; j++) {
                    System.out.print(" " + board[i][j]);
                }
                System.out.println(" ");
            } else {
                for (int j = 0; j < board[0].length; j++) {
                    if (board[i][j] == 2) {
                        System.out.print(" " + 2);
                    } else {
                        System.out.print(" " + board[i][j]);
                    }
                }
                System.out.println(" ");
            }
        }
        System.out.println("------------------------------------------");
    }

    private static void createShips(int[][] battleGround2, int[][] battleGround1) {
        // First ground ( Yeah, I`m very lazy ( ͡~ ͜ʖ ͡°) so I could not find smartest method ¯\_(ツ)_/¯ ) But I tried...

        battleGround1[0][0] = 1; // Single deck №1
        battleGround1[1][1] = 1; // Single deck №2
        battleGround1[2][2] = 1; // Single deck №3
        battleGround1[3][3] = 1; // Single deck №4

        battleGround1[6][1] = 1; // Double deck №1
        battleGround1[7][1] = 1; // Double deck №1 (2)
        battleGround1[2][4] = 1; // Double deck №2
        battleGround1[3][4] = 1; // Double deck №2 (2)
        battleGround1[7][6] = 1; // Double deck №3
        battleGround1[8][6] = 1; // Double deck №3 (2)

        battleGround1[2][7] = 1; // Three deck №1
        battleGround1[3][7] = 1; // Three deck №1 (2)
        battleGround1[4][7] = 1; // Three deck №1 (3)
        battleGround1[6][3] = 1; // Three deck №2
        battleGround1[7][3] = 1; // Three deck №2 (2)
        battleGround1[8][3] = 1; // Three deck №2 (3)

        battleGround1[6][8] = 1; // Four deck №1
        battleGround1[7][8] = 1; // Four deck №2 (2)
        battleGround1[8][8] = 1; // Four deck №3 (3)
        battleGround1[9][8] = 1; // Four deck №4 (4)


        // Second ground )))

        battleGround2[3][2] = 1; // Single deck №1
        battleGround2[5][2] = 1; // Single deck №2
        battleGround2[5][8] = 1; // Single deck №3
        battleGround2[7][7] = 1; // Single deck №4

        battleGround2[7][1] = 1; // Double deck №1
        battleGround2[8][1] = 1; // Double deck №1 (2)
        battleGround2[7][4] = 1; // Double deck №2
        battleGround2[8][4] = 1; // Double deck №2 (2)
        battleGround2[1][9] = 1; // Double deck №3
        battleGround2[2][9] = 1; // Double deck №3 (2)

        battleGround2[1][7] = 1; // Three deck №1
        battleGround2[2][7] = 1; // Three deck №1 (2)
        battleGround2[3][7] = 1; // Three deck №1 (3)
        battleGround2[1][0] = 1; // Three deck №2
        battleGround2[2][0] = 1; // Three deck №2 (2)
        battleGround2[3][0] = 1; // Three deck №2 (3)

        battleGround2[2][5] = 1; // Four deck №1
        battleGround2[3][5] = 1; // Four deck №2 (2)
        battleGround2[4][5] = 1; // Four deck №3 (3)
        battleGround2[5][5] = 1; // Four deck №4 (4)

    }

    private static int user1Fire(int[][] battleGround2, int hits1) {
        int row2, column2;
        System.out.println("Select a row to fire in enemy`s board2 (Second Ground):");
        row2 = scanner.nextInt();
        while (row2 > MAX_ROWS || row2 < MIN_ROWS) {
            System.out.println("Select a valid row between 1 and 10");
            row2 = scanner.nextInt();
        }

        System.out.println("Select a column to fire in enemy`s board2 (Second Ground):");
        column2 = scanner.nextInt();
        while (column2 > MAX_COLUMNS || column2 < MIN_COLUMNS) {
            System.out.println("Select a valid column between 1 and 10");
            column2 = scanner.nextInt();
        }

        if (battleGround2[row2 - 1][column2 - 1] == 1) {
            hits1++;
            System.out.println(" ***** HIT ᕦ( ͡° ͜ʖ ͡°)ᕤ ***** ");
            battleGround2[row2 - 1][column2 - 1] = 2;
        } else {
            System.out.println(" ***** MISS ¯\\_(ツ)_/¯ ***** ");
            battleGround2[row2 - 1][column2 - 1] = 0;
        }

        return hits1;
    }

    private static int user2Fire(int[][] battleGround1, int hits2) {
        int row1, column1;
        System.out.println("Select a row to fire in enemy`s board1 (First Ground):");
        row1 = scanner.nextInt();
        while (row1 > MAX_ROWS || row1 < MIN_ROWS) {
            System.out.println("Select a valid row between 1 and 10");
            row1 = scanner.nextInt();
        }
        System.out.println("Select a column to fire in enemy`s board1 (First Ground):");
        column1 = scanner.nextInt();
        while (column1 > MAX_COLUMNS || column1 < MIN_COLUMNS) {
            System.out.println("Select a valid column between 1 and 10");
            column1 = scanner.nextInt();
        }

        if (battleGround1[row1 - 1][column1 - 1] == 1) {
            hits2++;
            System.out.println(" ***** HIT ᕦ( ͡° ͜ʖ ͡°)ᕤ ***** ");
            battleGround1[row1 - 1][column1 - 1] = 2;
        } else {
            System.out.println(" ***** MISS ¯\\_(ツ)_/¯ ***** ");
            battleGround1[row1 - 1][column1 - 1] = 0;
        }
        return hits2;
    }

    public static void main(String[] args) {
        int[][] battleGround1 = new int[MAX_ROWS][MAX_COLUMNS];
        int[][] battleGround2 = new int[MAX_ROWS][MAX_COLUMNS];

        createShips(battleGround2, battleGround1);

        int hits1 = 0;
        int hits2 = 0;
        while (hits1 < 5 || hits2 < 5) {
            hits1++;
            hits2++;
            showBoard(battleGround1);
            showBoard(battleGround2);
            hits1 = user1Fire(battleGround2, hits1);
            hits2 = user2Fire(battleGround1, hits2);
        }
        if (hits1 > hits2) {
            System.out.println("User1 win");
        } else if (hits1 == hits2){
            System.out.println("Draw!");
        } else{
            System.out.println("User2 win");
        }
    }
}
/*
Создать 2 двумерных массива 10 на 10
Заполнить каждый из них единицами по правилам расстановки кораблей в игре, остальные поля остаются нулями:
1 корабль — ряд из 4 клеток («четырёхпалубный»; линкор)
2 корабля — ряд из 3 клеток («трёхпалубные»; крейсера)
3 корабля — ряд из 2 клеток («двухпалубные»; эсминцы)
4 корабля — 1 клетка («однопалубные»; торпедные катера)

Выведите на экран 2 заполненых игровых поля
Далее первый игрок вводит координаты на поле - например 7 и 5. Это будет 7 ряд и 5 колонка на игровом поле противника. Если элемент массива по заданым индексам = 1, то он попал, если там 0 - не попал
Далее второй игрок вводит 2 числа, проверяем попал или нет и так пока не выиграет один из участников.
Подсказки
Нужно считать сколько было попаданий у каждого игрока, чтобы определить момент победы и победителя
Для упрощения задачи, считаем, что игроки не будут повторять одни и те же координаты по несколько раз
 */