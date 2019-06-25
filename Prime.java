package com.company;
import java.lang.String;
public class Prime {
    private static final int MIN_VALUE = 20;
    private static final int MAX_VALUE = 100000;

    public static void main(String[] args) {
        int counter = 0;
        for (int i = MIN_VALUE; i <= MAX_VALUE; i++) {
            if (isPrime(i))
                System.out.println("Received frequencies  >>> " + i);
            counter++;

        }
        System.out.println("Quantity of frequencies: " + counter );

    }

    public static boolean isPrime(int checkNumber) {
        //int remainder;
        for (int i = 2; i <= checkNumber / 2; i++) {
            if (checkNumber <= 3) {
                return checkNumber > 1;
            } else if ((checkNumber % 2 == 0) || (checkNumber % 3) == 0) ;
            //return false;
            //}
            //return true;
            //return true;
        }
        //System.out.println(checkNumber);
        return false;
    }
}
/*
function is_prime(n)
     if n ≤ 3
        return n > 1
     else if n mod 2 = 0 or n mod 3 = 0
        return false
     let i ← 5
     while i * i ≤ n
        if n mod i = 0 or n mod (i + 2) = 0
            return false
        i ← i + 6
     return true
 */

/*
if(n <= 3)
            return n > 1;
        else if((n % 2 == 0) || (n % 3) == 0)
            return false;
 */