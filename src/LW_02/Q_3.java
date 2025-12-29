package LW_02;

import java.util.Scanner;



public class Q_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int nRows = sc.nextInt();

        int numOfStars;
        int numOfSideSpaces = (2*nRows - 1)/2 ;


        for (int i = 1; i <= nRows; i++) {
            numOfStars = 2*i - 1;

            for (int j = 0; j < numOfSideSpaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < numOfStars ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < numOfSideSpaces; j++) {
                System.out.print(" ");
            }

            numOfSideSpaces--;
            System.out.println();
        }
    }
}
