package com.company;
import java.lang.String;
public class SystemArrayCopyExample1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 3, 2, 1}; //source array
        int[] b = new int[10]; //destination array
        int src[], srcPos, dest[], destPos, length;
        src = a;
        srcPos = 1;
        dest = b;
        destPos = 2;
        length = 4;
        System.out.print("Source array: ");
        for (int i = 0; i < src.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
        System.out.print("Destination array: ");
        for (int i = 0; i < src.length; i++) {
            System.out.print(b[i]);
        }
        System.out.println();
        System.out.println("Source Position: " + srcPos);
        System.out.println("Destination Position: " + destPos);
        System.out.println("Length:" + length);
        System.arraycopy(src, srcPos, dest, destPos, length); //use of arraycopy() method
        System.out.println("Destination array after use of arraycopy() ");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

}