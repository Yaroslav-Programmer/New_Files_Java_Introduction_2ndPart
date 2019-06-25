package com.company;
import java.lang.String;
public class Primes {
    private static final int MIN_VALUE = 20;
    private static final int MAX_VALUE = 100000;

    public static void main(String[] args) {
        int counter = 0;
        for (int i = MIN_VALUE; i <= MAX_VALUE; i++) {
            if (isPrime(i))
                System.out.println("Received frequencies  >>> " + i + " Hz");
            counter++;

        }
        System.out.println("Quantity of frequencies: " + counter);
    }

    private static boolean isPrime(int checkNumber) {
        int remainder;
        for (int i = 2; i <= checkNumber / 2; i++) {
            remainder = checkNumber % i;
            if (remainder == 0) {
                return false;
            }
        }
        return true;

    }
}
/*
Человечество вступило в контакт с инопланетной формой жизни. Данная форма жизни подает сигналы на частотах, величины которых являются простыми числами.
Человечество может принимать и отправлять сигналы в диапазоне от 20 до 100000 герц.
Напишите функцию, которая будет определять все частоты, на которых можно передавать сигнал инопланетянам.
 */