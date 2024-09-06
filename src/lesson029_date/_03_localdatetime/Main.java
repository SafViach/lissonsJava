package lesson029_date._03_localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;

public class Main {

    public static void main(String[] args) {
        //в java 8 создали отдельный пакет time
        //LocalDate для работы с датой
        //LocalTime для работы с временем
        //LocalDateTime для работы с датой и временем
        //Period - разница между двумя датами
        //Duration - разницы между двумя временами

        //статический метод now для получения тек даты и времени
        LocalDateTime date1 = LocalDateTime.now();
        //есть отдельный геттер на каждое значение(роле)
        System.out.println(date1.getMonth());//месяц перечилением
        System.out.println(date1.getMonthValue());
        System.out.println(date1.getDayOfWeek());//день недели перечислением
        System.out.println(date1.getDayOfMonth());

        //универсальный геттер можно отправит один из элементов перечисления
        //ChronoField
        System.out.println(date1.get(ChronoField.YEAR));


        //объекты новых классов являются immutable

        //with по смыслу то же самое что и set, но  он не меняет значение поля,
        //а создает новый объект с другим значением поля
        LocalDateTime date2 = date1.withHour(23);//поэтому при любом изменение мы должны ловить новый объект
        LocalDateTime date3 = date1.with(ChronoField.HOUR_OF_DAY, 22);// изменение через универсальный with

        System.out.println(date2);

        //date1.plusDays(4) конкретные методы для увеличения даты на единицу времени
        //date1.minusDays() конкретные методы для уменьшения даты на единицу времени

        //DateTimeFormatter - класс для задания шаблона представления в виде строки и преобразования строки в объект

        System.out.println("------------");
        //статический метод для создания объекта шаблона даты и времени
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
        System.out.println(formatter1.format(date1));

        //как из строки получить LocalDate
        String dateStr = "18.06.2024";

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        //статический метод класса parse получить из строки по указанному формату нужный объект
        LocalDate ldate1 = LocalDate.parse(dateStr, formatter2);

        //из объекта в String
        System.out.println(formatter2.format(ldate1));


    }
}
