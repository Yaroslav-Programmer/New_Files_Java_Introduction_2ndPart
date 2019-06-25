package com.company;
import java.lang.String;
public class Salary2 {
    public static void main(String[] args) {
        double RATE_PER_HOUR = 25;
        double WORKS_HOURS = 8;
        double WORK_DAYS = 5;
        double WEEKS_IN_YEAR = 52;

        double salary = RATE_PER_HOUR * WORKS_HOURS * WORK_DAYS * WEEKS_IN_YEAR;

        System.out.println(salary);



    }
}
