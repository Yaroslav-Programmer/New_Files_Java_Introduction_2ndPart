package com.company;
import java.lang.String;
public class SwitchCase {
    public static void main(String[] args) {
        int num = 23;
        switch (num) {
            case 12:
                System.out.println("Num is 12");
                break;
            case 245:
                System.out.println("Num is 245");
                break;
            case 23:
                System.out.println("Num is 23");
                if (num == 23)
                    System.out.println("All is OK");

                break;
            default:
                System.out.println("Num is unknown");


        }
    }
}
