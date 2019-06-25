package com.company;
import java.lang.String;
public class Two_Arrays {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[3];

        array1 = array2;

        array1[1] = 100;
        array2[1] = 200;

        System.out.println(array1[1]);
        System.out.println(array2[1]);
    }
}