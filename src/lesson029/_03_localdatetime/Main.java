package lesson029._03_localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd,MM,ss");
        LocalDateTime date1 = LocalDateTime.now();
        System.out.println(formatter.format(date1));

        String strDate = "07.07.1997";
        DateTimeFormatter formatter2= DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate date12 =  LocalDate.parse(strDate,formatter2);

        System.out.println(formatter2.format(date12));
    }
}
