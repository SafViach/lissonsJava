package lesson029_date._01_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {


        //Date предназначен для работы с датами и временем
        Date date1 = new Date();
        System.out.println(date1);

        //кол-во миллисекунд прошедших с 1 января 1970 00:00:00
        System.out.println(date1.getTime());

        Date date2 = new Date(9223372036854775807l);
        System.out.println(date2);

        //конструкторы Date принимают странные значения
        Date date3 = new Date(2024, 8, 14);
        System.out.println(date3);

        //1900 + year, месяц 0-11
        Date date4 = new Date(124, 7, 14);
        System.out.println(date4);

        //вывод даты неудобен через методы класса
        System.out.println(date1.getDate() + "." + (date1.getMonth() + 1) + "." + (date1.getYear() + 1900));
        System.out.println(date1.getHours() + ":" + date1.getMinutes() + ":" + date1.getSeconds());

        System.out.println(date1.before(date2));//дата1  перед датой2 true
        System.out.println(date1.after(date2));//дата1  после даты2 false

        System.out.println("----------------------------");
        //SimpleDateFormat  класс определяющий шаблон перевода даты в строку и строки в дату

        //yyyy - четыреххначный год
        //yy  - две последние цифры года
        //MM - числовой месяц с лидирующим нулем
        //M - числовой месяц без лидирующего нуля
        //MMM - сокращенное назв месяца
        //ММММ - полное название месяца
        //dd - число в месяце с лидирующим нулем
        //d - число в месяце без лидирующего нуля

        //HH,H - часы 0-23
        //hh,h - часы 0-11    a - (AM или PM)
        //mm,m - минуты
        //ss - секунды

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("'Дата' dd.MM.yyyy', время' HH:mm:ss");
        System.out.println(simpleDateFormat1.format(date1));
        System.out.println(simpleDateFormat2.format(date1));
        System.out.println(simpleDateFormat3.format(date1));

        System.out.println("-------------------------------------");
        //допустим дата хранилась в таком формате в строке
        String dateStr = "24.09.2024";//недобно
        //из этой даты создать объект Date и вывести в америк. стиль  месяц/число/год

        SimpleDateFormat formatFrom = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat formatTo = new SimpleDateFormat("MM/dd/yyyy");

        try {
            //как из строки получить объект Date в соответсвии с шаблоном
            Date dateParse = formatFrom.parse(dateStr);

            //как из объекта Date получить String в соответсвии с шаблоном
            System.out.println(formatTo.format(dateParse));

        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
