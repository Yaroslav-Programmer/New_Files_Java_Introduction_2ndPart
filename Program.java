package com.company;
import java.lang.String;
public class Program {
    public static int MAXIMUM_PAYOUT_AMOUNT = 1000000;

    public static void main(String[] args) {
        int days = 0;
        int payments = 0;
        for (int salary = 1; payments <= MAXIMUM_PAYOUT_AMOUNT; salary *= 3) {
            payments += salary;
            System.out.println("---------------------------------");
            System.out.println("salary: " + salary);
            System.out.println("sum: " + payments);
            System.out.println("---------------------------------");
            days++;
        }
        System.out.println("Contract days: " + days);
    }
}