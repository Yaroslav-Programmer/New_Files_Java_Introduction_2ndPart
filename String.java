package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class String {
    private static final int VALUE = 10;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(java.lang.String[] args) {
        var min = 0;
        var max = 0;
        ArrayList<java.lang.String> list = new ArrayList();
        for (int i = 0; i < VALUE; i++) {
            System.out.println("Input string: ");
            list.add(scanner.nextLine());
        }
        for (int i = 1; i < list.size(); i++) {
            if (list.get(max).length() < list.get(i).length()) {
                max = i;
            }
            if (list.get(min).length() > list.get(i).length()) {
                min = i;
            }
        }
        if (max < min) {
            System.out.println(" The biggest string appeared earlier: " + list.get(max));
        } else
            System.out.println("The smallest string appeared earlier: " + list.get(min));
    }
}