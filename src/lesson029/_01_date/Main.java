package lesson029._01_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Main {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println(date1);


        SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(format1.format(date1));
        SimpleDateFormat format2 = new SimpleDateFormat( "hh:mm:ss");
        String strDate = "07.07.1997";

        System.out.println(strDate);
        //создание обьекта из строки даты
        try {
            Date dateObject = format1.parse(strDate);
            System.out.println(format1.format(dateObject));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
