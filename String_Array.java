package com.company;

import java.util.Scanner;
import java.lang.String;

public class String_Array {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] array = new String[5];

        fillArray(array);
    }

    private static void fillArray(String[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Input string elements of array: " + array[i]);
            array[i] = scanner.nextLine();
        }
        //int max = 0;
        int elementLength = array[0].length();
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > elementLength) {
                max = i;
                elementLength = array[i].length();
            }
        }
        System.out.println("The longest string is: " + array[max]);

        findMaximum(max, array);
    }
    public static String findMaximum(int max, String [] array){
        for (int i = 0; i < array.length ; i++) {
            //if(array[i] == max){
                //System.out.println("Max values are: " + array[max]);
            //}
        }
        return array[max];
    }
}
/*
Массивы 7:
        1. Создай массив строк. //
        2. Считай с клавиатуры 5 строк и добавь в массив. //
        3. Используя цикл, найди самую длинную строку в массиве.//
        4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.
 */