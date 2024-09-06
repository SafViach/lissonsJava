package lesson032._03_fanction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

//метод вернёт коллекцию типа R на основании пришедшей а метод коллекции типа T по правилу описанному в лямбде function
public class UtilsFunction {
    public static <T,R>List<R>getList(List<T>list , Function<T,R> function){
        List<R>resultList = new ArrayList<>();
        for (T object : list) {
           resultList.add(function.apply(object));//метод примет обьект и вернет новый  обьект в соответствии
            // с телом лямбы
        }
        return resultList;
    }
}
