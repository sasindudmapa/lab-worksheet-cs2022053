package LW_01;


import java.util.Scanner;


public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  ft;
        float inch, cmLen;

        System.out.print("Enter the length in cm: ");
        cmLen = sc.nextFloat();

        inch = cmLen / 2.54f;
        ft = (int) inch/12;
        inch = inch % 12;
        System.out.print(ft + " ft " + inch + " inches.");
    }
}

