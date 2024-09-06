package tasks28dz.task05;
//5. Информация об отдыхающих в санатории хранится в файле (ФИО, дата и время заселения,
//номер комнаты, дата и время выселения). Считается что в файле актуальными разделителями
//числа, месяца и года может быть «.» или «/». Часы и минуты разделяются «:» или «-», например
//01.01.2024 19:00,
//01/01/2024 19-00,
//01/01/2024 19:00
//Дата заселения должна быть меньше даты выселения
//5.1 Считать информацию из файла и на основании корректных строк создать объекты и
//организовать их хранение в коллекции.
//5.2 Получить подколлекцию людей, которые на текущую дату отдыхают в санатории
//5.3 Получить подколлекцию людей, которые отдыхали но выселились из санатория
//5.4 Получить подколлекцию людей, которые еще не отдыхали, но приедут отдыхать
//5.5 Вывести информацию о людях, которые на текущий момент живут в комнате номер 666
//5.5 Вывести информацию о человеке с самым долгим отдыхом
//5.6 Отсортировать основную коллекцию по номеру комнаты
//5.7 Подсчитать сколько людей живет в каждой комнате на данный момент

import tasks28dz.task05.Model.CollectionOfVacantiontsInTheSanatorium;
import tasks28dz.task05.Model.Vacationer;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String separator = File.separator;
        String file = "src"+separator+"tasks28dz"+separator+"data"+separator+"inListSanatorium.txt";

        CollectionOfVacantiontsInTheSanatorium.readerFile(file);

        LocalDate nowDate = LocalDate.now();
        System.out.println("             считали из файла и записали в коллекцию");
        for (Vacationer vacationer : CollectionOfVacantiontsInTheSanatorium.getVacationers()) {
            System.out.println(vacationer);
        }
        System.out.println("             практика с лямбдами");
        System.out.println("             получаю подколекцю людей которые еще отдыхают в санатории");
        List<Vacationer> subListVacationers = CollectionOfVacantiontsInTheSanatorium.getList(CollectionOfVacantiontsInTheSanatorium.getVacationers(),
                vacationer -> new Vacationer(vacationer.getFullNameVacationer(),
                        vacationer.getCheckInDateTime(),
                        vacationer.getCheckOutDateTime(),
                        vacationer.getRoomNumber()),
                vacationer -> nowDate.toEpochDay() - vacationer.getCheckInDateTime().toLocalDate().toEpochDay()  > 0
        && nowDate.toEpochDay() - vacationer.getCheckOutDateTime().toLocalDate().toEpochDay() < 0);

        for (Vacationer subListVacationer : subListVacationers) {
            System.out.println(subListVacationer);
        }
        System.out.println("            получаю подколлекцию людей которые отдыхали");
        List<Vacationer> subListNoVacationers = CollectionOfVacantiontsInTheSanatorium.getList(CollectionOfVacantiontsInTheSanatorium.getVacationers(),
                vacationer -> new Vacationer(vacationer.getFullNameVacationer(),
                        vacationer.getCheckInDateTime(),
                        vacationer.getCheckOutDateTime(),
                        vacationer.getRoomNumber()),
                vacationer -> nowDate.toEpochDay() - vacationer.getCheckInDateTime().toLocalDate().toEpochDay()>0
        &&nowDate.toEpochDay() - vacationer.getCheckOutDateTime().toLocalDate().toEpochDay() >0);

        for (Vacationer subListNoVacationer : subListNoVacationers) {
            System.out.println(subListNoVacationer);
        }

        System.out.println("            получаю подколлекцию людей которые еще не отдыхали но будут ");

        List<Vacationer>subListFurureVacationer = CollectionOfVacantiontsInTheSanatorium.getList(CollectionOfVacantiontsInTheSanatorium.getVacationers(),
                vacationer -> new Vacationer(vacationer.getFullNameVacationer(),
                        vacationer.getCheckInDateTime(),
                        vacationer.getCheckOutDateTime(),
                        vacationer.getRoomNumber()),
                vacationer ->nowDate.toEpochDay() - vacationer.getCheckInDateTime().toLocalDate().toEpochDay() < 0
        && nowDate.toEpochDay() - vacationer.getCheckOutDateTime().toLocalDate().toEpochDay() < 0);

        for (Vacationer vacationer : subListFurureVacationer) {
            System.out.println(vacationer);
        }
        System.out.println(CollectionOfVacantiontsInTheSanatorium.getVacationers().get(4).getCheckInDateTime().toLocalDate().toEpochDay()-
                nowDate.toEpochDay());
        System.out.println("                вывести информацию о человеке который проживает в комнате 666");
        int room = 666;
//        for (Vacationer vacationer : CollectionOfVacantiontsInTheSanatorium.getVacationers()) {
//            if (vacationer.getRoomNumber()==room)
//                System.out.println(vacationer);
//        }
        CollectionOfVacantiontsInTheSanatorium.getAccordingToCondition(CollectionOfVacantiontsInTheSanatorium.getVacationers(),
                vacationer -> vacationer.getRoomNumber()==room);
        System.out.println("            вывести человека который больше всех отдыхает");
//        CollectionOfVacantiontsInTheSanatorium.getAccordingToCondition(CollectionOfVacantiontsInTheSanatorium.getVacationers(),
//                vacationer -> vacationer.getCheckInDateTime().toLocalDate().toEpochDay()-
//                vacationer.getCheckOutDateTime().toLocalDate().toEpochDay()>);
        CollectionOfVacantiontsInTheSanatorium.getMaxVacationer();
        //Collections.sort(CollectionOfVacantiontsInTheSanatorium.getVacationers(), Comparator->);

    }
}
