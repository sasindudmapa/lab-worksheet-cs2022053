package LW_02;
import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int count = 0;

        while(true){
            System.out.print("Enter the Number: ");
            number = sc.nextInt();

            if(number < 0){
                break;
            }

            if(number == 0){
                count = 1;
            }

            while(number > 0){
                number = number / 10;
                count++;
            }

            System.out.println(count);
            count = 0;
        }
    }
}




