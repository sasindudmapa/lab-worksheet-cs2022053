package LW_01;

import java.util.Scanner;


public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fullName;

        System.out.print("Enter your full name(first middle last): ");
        fullName = sc.nextLine();

        String[] fullNameInParts = fullName.split(" ");
        System.out.println(fullNameInParts[2] + ", " + fullNameInParts[0] + " " + fullNameInParts[1].charAt(0) + ".");
    }
}
