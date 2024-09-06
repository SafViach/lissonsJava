package lesson033streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(4 , -8, 0 ,13 , 99 , -14 , 0 , 15 , -8));
        //вывести отрицательные элементы
        list1.forEach(elem -> System.out.print(elem+" "));
        System.out.println(" ");
        System.out.println("----------------------");
        System.out.println(" ");
        for (Integer elem : list1) {
            if (elem < 0){
                System.out.print(elem + " ");
            }
        }

        //вызывая метод stream() на коллекции будет создан обьект типа Stream (интерфейс)
        Stream<Integer> stream = list1.stream();// создали трубу (начало) и записали в ссылку stream
        //это создание стрима на основе коллекции
        // стрим - это как труба состоящая из секций , каждая секция определяет действие над обьектом , который в неё попадает
        // построение секций осуществляется методами Stream
        // 1) источкик - ГОЛОВА (Head) создание стрима на основе коллекции или массива (метод stream())
        // 2) промежуточные - строятся при помощи методов котрые возвращают тип Steam  , возвращают трубу с достроенной секцией
        // 3) терминальный - операция завершающая работу над каждым оббьектом , финальная секция трубы - возвращает любой др тип но не Stream
        System.out.println(" ");
        stream = stream.filter(elem -> elem < 0);// к голове трубы присоединили промежуточную секцию
        stream.forEach(elem -> System.out.println(elem+ " "));// к трубу приделали финальную часть ()
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------");
        //построение стрима по секциям01
        // можно сразу построить и запусть stram  но плохо читается
        list1.stream().filter(elem -> elem < 0).forEach(elem -> System.out.print(elem + " "));
        System.out.println();
        System.out.println("---------------------------------------------");
        list1.stream()
                .filter(elem -> elem < 0)
                .forEach(elem -> System.out.println(elem + " "));
        System.out.println();
        System.out.println("-------------------------------------------------");


    }
}
