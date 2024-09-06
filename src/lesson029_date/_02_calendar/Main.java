package lesson029_date._02_calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        //Calendar позволяет не только хранить дату но и перемещаться по ней
        //(увеличивать или уменьшать на любую единицу времени)

        Calendar calendar1 = new GregorianCalendar();//текущая дата и время
        System.out.println(calendar1);

        //calendar1.get() универсальный геттер котрый может вернуть
        //любое поле по значению одной из статических констант класса
        System.out.println(calendar1.get(5) + " " + (calendar1.get(2)+1) + " " + calendar1.get(1));
        System.out.println(calendar1.get(Calendar.DATE) + " " + (calendar1.get(Calendar.MONTH)+1) +
                                                                        " " + calendar1.get(Calendar.YEAR));

        //универсальный сеттер(что меняем, на какое значение)
        calendar1.set(Calendar.YEAR, 2025);//меняем в каледаре в хранимой дате год на 2025
        calendar1.set(Calendar.MINUTE, 50);//меняем в каледаре в хранимой дате минуты на значение 50

        //calendar1.add(); увеличить или уменьшить дату на указанную единицу времени
        calendar1.add(Calendar.DATE, 28);//изменит дату увеличив ее на 28 дней
        calendar1.add(Calendar.MONTH, -10);////изменит дату уменьшив ее на 10 месяцев

        //calendar1.getTime() вернет дату в виде объекта Date

        Date date1 = calendar1.getTime();
        // число месяц_словом год часы(24)-мин-сек

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd MMMM yyyy HH-mm-ss");
        System.out.println(simpleDateFormat1.format(date1));

        //месяц от 0 до 11
        Calendar calendar2 = new GregorianCalendar(2024, 11, 30, 18, 25, 30);
        System.out.println(simpleDateFormat1.format(calendar2.getTime()));


    }
}
