package LW_02;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Q_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence to check:");
        String sentence = sc.nextLine();

        String delimiters = " ,.!?;:\"()[]{}";
        StringTokenizer st = new StringTokenizer(sentence, delimiters);

        StringBuilder cleanText = new StringBuilder();

        while (st.hasMoreTokens()) {
            cleanText.append(st.nextToken().toLowerCase());
        }

        String finalString = cleanText.toString();

        String reversedString = cleanText.reverse().toString();

        if (finalString.equals(reversedString) && !finalString.isEmpty()) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("Not a palindrome.");
        }

        sc.close();
    }
}
