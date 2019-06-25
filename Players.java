package com.company;
import java.lang.String;
public class Players {
    public static void main(String[] args) {
        int[] players = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        pointsOfPlayers(players);
    }

    public static int pointsOfPlayers(int[] players) {
        int mainPoints = 0;
        int secondaryPoints = 0;
        for (int i = 0; i < players.length; i++) {
            System.out.println(i);
            System.out.println("-------------------------");
            System.out.println(players[i]);
        }
        //System.out.println("Difference in points are: " + mainPoints - secondaryPoints);
        return mainPoints - secondaryPoints;
    }
}
/*
В вашей баскетбольной команде 10 человек.
Очки игроков основного состава записаны в четные ячейки массива , а запасных игроков - в нечетных.
Написать функцию, которая найдет насколько больше очков заработал основной состав по отношению к запасным игрокам.
 */