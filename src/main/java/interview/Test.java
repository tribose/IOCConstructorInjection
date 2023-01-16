package interview;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {

    public static void main(String[] args) {
        String s = "24-MAY-2022 10:30 AM";

        //LocalDateTime localDateTime = LocalDateTime.parse(s);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy hh:mm a");

        try {
            System.out.println(simpleDateFormat.parse(s));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        /*DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm a");

        System.out.println(format.parse(s));*/
    }
}
