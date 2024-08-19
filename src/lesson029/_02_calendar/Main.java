package lesson029._02_calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar);
        System.out.println(calendar.get(5)+ " " + (calendar.get(2)+1)+" "+calendar.get(1));
        System.out.println(calendar.DAY_OF_YEAR + " "+ calendar.DAY_OF_MONTH + " "+ Calendar.MONTH);
       calendar.set(Calendar.DATE , 7);
        System.out.println(calendar.get(5));

        calendar.add(Calendar.DATE ,10);
        System.out.println(calendar.get(5));
        Date date20 = calendar.getTime();
        SimpleDateFormat format = new SimpleDateFormat("'Дата 'dd,MM,yyyy ; 'Время'hh:mm:ss");
        System.out.println(format.format(date20));
        Calendar calendar2 = new GregorianCalendar(1997,7,7,12,12,12);
        System.out.println(format.format(calendar2.getTime()));

    }
}
