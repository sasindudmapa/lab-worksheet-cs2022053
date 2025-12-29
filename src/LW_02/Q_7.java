package LW_02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q_7 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy");
        System.out.println(date.format(formatter));
    }
}
