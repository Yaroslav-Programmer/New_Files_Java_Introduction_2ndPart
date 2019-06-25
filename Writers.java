package com.company;
import java.lang.String;
public class Writers {
    public static void main(String[] args) {
        String[][] arr = {{"Bernard Shaw", "Gunter Grass", "Eugene O`Neill",
                "Aleksandr Solzhenitsyn", "Maurice Maeterlinck", "Bertrand Russell"},
                {"is American", "is Irish", "is German", "is Russian", "is Belgian", "is British"}};

        String a = arr[0][0]; // Bernard Shaw
        String b = arr[1][1]; // is Irish
        String c = arr[0][1]; // Gunter Grass
        String d = arr[1][2]; // is German
        String e = arr[0][2]; // Eugene O`Neill
        String f = arr[1][0]; // is American
        String g = arr[0][3]; // Aleksandr Solzhenitsyn
        String h = arr[1][3]; // is Russian
        String i = arr[0][4]; // Maurice Maeterlinck
        String j = arr[1][4]; // is Belgian
        String k = arr[0][5]; // Bertrand Russell
        String l = arr[1][5]; // is British


        //System.out.println(Arrays.deepToString(arr)); // First way to print elements of an array(для одновимірного масиву)


        //for (String t : arr) { // Second way to print elements of an array
        /*
        First way(harder)
         */
        System.out.println("------------------------------------------------------");
        System.out.println(a + " " + b);
        System.out.println(c + " " + d);
        System.out.println(e + " " + f);
        System.out.println(g + " " + h);
        System.out.println(i + " " + j);
        System.out.println(k + " " + l);
        System.out.println("------------------------------------------------------");

        /*
        Second way(easier and it does not work)
         */
        String[] writers = {"Bernard Shaw", "Gunter Grass", "Eugene O`Neill",
                "Aleksandr Solzhenitsyn", "Maurice Maeterlinck", "Bertrand Russell"};
        String[] nationality = {"is American", "is Irish", "is German", "is Russian", "is Belgian", "is British"};

        //for (String t : writers) {
        //for (String z : nationality) {

        System.out.println("------------------------------------------------------");
        System.out.println(writers[0] + " " + nationality[1]);
        System.out.println(writers[1] + " " + nationality[2]);
        System.out.println(writers[2] + " " + nationality[0]);
        System.out.println(writers[3] + " " + nationality[3]);
        System.out.println(writers[4] + " " + nationality[4]);
        System.out.println(writers[5] + " " + nationality[5]);
        //System.out.println(t + " " + z);
        System.out.println("------------------------------------------------------");

        //System.out.println(t);

        //System.out.println(z);
        //}
        //}


    }

}

//}
/*
public class MyClass {
   public static void main(String[] args) {
     int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
     for (int i = 0; i < myNumbers.length; ++i) {
        for(int j = 0; j < myNumbers[i].length; ++j) {
           System.out.println(myNumbers[i][j]);
        }
     }
   }
}

 */
