package com.company;
import java.lang.String;
public class Salary {
    private static int Hours_Per_Day = 8;
    private  static  int Days_In_Week = 5;
    private  static  int WEEKS_IN_YEAR = 52;
    public static void main(String[] args) {
        double rate = 20;
        double salary = calculateSalary(rate);
        System.out.println(salary);
    }
    public  static double calculateSalary (double hourlyrate) {
        double salary  = hourlyrate * Hours_Per_Day * Days_In_Week * WEEKS_IN_YEAR;
        return salary;
    }
}

