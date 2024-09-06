package lesson032._02_predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Utils {
    public static <T>int countByCondition(List<T> list , Predicate<T> predicate){
        int counter = 0;
        for (T object : list) {
            if (predicate.test(object)){
                counter++;
            }
        }
        return counter;
    }

    public static <T> List<T> subListByCondition(List<T> list, Predicate<T> predicate){
        List<T> subList = new ArrayList<>();

        for (T object : list) { // перебираем коллекцию
            if (predicate.test(object)){ // если обьект сооьвнетствует условию лямбды которую сюда прислали
                subList.add(object);// добавляет этот обьект в коллекцию новую
            }
        }
        return subList;
    }
}
