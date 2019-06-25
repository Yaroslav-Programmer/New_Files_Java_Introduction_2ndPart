package com.company;
import java.lang.String;
public class MainMain {
    public static void main(String[] args) {
        OOP.write("Your number is : " + OOP.summ );
        System.out.println(OOP.summ);
        OOP Macks = new OOP(180,78.4d);

        Macks.say("Hi, I am Macks");
        System.out.println(Macks.height);

        OOP Oleg = new OOP();
        Oleg.height = 195;
        Oleg.weight = 96.7d;
        System.out.println(Oleg.height);

        Student Vova = new Student(178,98,3);
        System.out.println(Vova.course);


    }
}
