package LW_02;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Q_6 {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("d MMMM yyyy");
        System.out.println(sdf.format(today));
    }
}
