package com.company;
import java.util.Scanner;
import java.lang.String;
public class SalaryIFELSE {
    public static final int MONTHS = 12;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int experience = scan.nextInt();

        Scanner scanner = new Scanner(System.in);
        double ratepermonth = scanner.nextDouble();

        System.out.println("Salary is : " + salaryplus(experience, ratepermonth));
    }
    public static double salaryplus(int experience, double ratepermonth){
        double salary = (ratepermonth * MONTHS);
        if (experience >=5 && experience <= 10){
            salary+=100;
        } else if(experience < 5 || experience > 10){
            salary+=500;
        }
        return salary;
    }
}
