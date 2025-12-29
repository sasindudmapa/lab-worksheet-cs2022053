package LW_02;

import java.util.Scanner;

public class Q_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the number: ");
            nums[i] = sc.nextInt();
        }
        int secMax = nums[0];
        int Max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >= Max){
                secMax = Max;
                Max = nums[i];
            }else if(nums[i] > secMax){
                secMax = nums[i];
            }
        }
        System.out.println(Max);
        System.out.println(secMax);
    }
}
