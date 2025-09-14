package LW_01;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name;
        int ValidName = 0;

        while(ValidName == 0){
            System.out.print("Enter a name with odd number of characters: ");
            name = sc.nextLine();

            if(name.length() % 2 != 0){
                System.out.println(name.charAt(name.length()/2));
                ValidName = 1;
            }else{
                System.out.println("Make sure you enter a name with odd number of characters!");
            }
        }

    }
}
