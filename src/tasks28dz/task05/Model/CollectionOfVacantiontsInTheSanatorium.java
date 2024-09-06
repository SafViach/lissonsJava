package tasks28dz.task05.Model;

import lesson032._01_predifined_intergaces.Main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CollectionOfVacantiontsInTheSanatorium {
    private static List<Vacationer> vacationers = new ArrayList<>();

    public static List<Vacationer> getVacationers() {
        return vacationers;
    }

    public static void add(Vacationer vacationer){
        vacationers.add(vacationer);
    }

    public static void readerFile(String file ){

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String fileLine = null;
            String regex =
                    "([А-Я]{1}[а-яё]{2,})" +//1
                    "\\s([А-Я]{1}[а-яё]{2,})" +//2
                    "\\s([А-Я]{1}[а-яё]{2,})" +//3
                    "\\s(\\d{2}.\\d{2}.\\d{4})" + "\\s(\\d{2}:\\d{2})" +//4,5
                    "\\s(\\d+)" +//6
                    "\\s(\\d{2}.\\d{2}.\\d{4})" + "\\s(\\d{2}:\\d{2})";//7,8
            Pattern pattern = Pattern.compile(regex);
            while ((fileLine = br.readLine())!=null){
                    Matcher matcher = pattern.matcher(fileLine);
                    if (matcher.find()) {
                        String name = matcher.group(1) + matcher.group(2) + matcher.group(3);
                        int roomNumber = Integer.valueOf(matcher.group(6));
                        DateTimeFormatter checkInDateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
                        LocalDateTime localDateTimeIn = null;
                        LocalDateTime localDateTimeOut = null;
                        try {
                            localDateTimeIn = LocalDateTime.parse(matcher.group(4) +" "+ matcher.group(5), checkInDateTimeFormatter);
                            localDateTimeOut = LocalDateTime.parse(matcher.group(7) +" "+ matcher.group(8), checkInDateTimeFormatter);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        Vacationer vacationer = new Vacationer(name, localDateTimeIn, localDateTimeOut,roomNumber);
                        vacationers.add(vacationer);
                    }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //получить коллекцию людей которые еще отдыхают в санатории
    public static <T,R> List<R> getList(List<T> list , Function<T,R> function,Predicate<T> predicate){
        List<R> subList = new ArrayList<>();
        for (T object : list) {
            if (predicate.test(object)){
                subList.add(function.apply(object));
            }
        }
        return subList;
    }
    public static <T>void getAccordingToCondition(List<T>list , Predicate<T> predicate){
        for (T object : list) {
            if (predicate.test(object)){
                System.out.println(object);
            }
        }
    }
//    public static <T> void getAccordingToCondition( Predicate<T>predicate , Predicate<T> predicate2){
//        LocalDate nowDate = LocalDate.now();
//        Vacationer maxVacationer = CollectionOfVacantiontsInTheSanatorium.getVacationers().get(0);
//        for (Vacationer vacationer : vacationers) {
//            vacationer.
//        }
//    }
    //получить информацию о человеке который долше всех отдыхает
    public static <T>void getMaxVacationer(){
        Vacationer maxVacationer = null;
        long colDayVacation = 0;
        for (Vacationer vacationer : vacationers) {
            if (colDayVacation < vacationer.getCheckOutDateTime().toLocalDate().toEpochDay()
                    -vacationer.getCheckInDateTime().toLocalDate().toEpochDay()){
                maxVacationer = vacationer;
            }
        }
        System.out.println(maxVacationer);
    }


}
