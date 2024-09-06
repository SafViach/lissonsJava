package lesson033streamAPI;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(4 , -8, 0 ,13 , 99 , -14 , 0 , 15 , -8));
        list1.forEach(elem -> System.out.println(elem));
        //list1.stream().forEach(elem -> System.out.println(elem)); здесь применять стрим бессмысленно
        // если в стриме одна терминальная опперация которая могла быть выполнена методом коллекции то неразумно (ток более тяжеловеснее)
        //.forEach - терминальный операция действие над каждым обьектом , напр вывод
        list1.stream().count();//подсчитали кол-во обьектов в прошедших в эту секцию

        //list1.stream().filter(elem -> elem > 0).count(); выел сколько положительных чисел в коллекции
        //.filter промежуточная операция , пропускает в след секцию элементы удовлетоворяющие условию
        System.out.println("-------------------------------------");
        int counter = (int)list1.stream()//источник
                .filter(elem -> elem > 0 )//промежуток
                .count();//терминальная операция
        System.out.println(counter);
        list1.stream()
                .filter(elem -> elem!=0 && elem%2 ==0)
                // метод map() для выполнения действия над элементами
                // map() может вернуть стрим другого типа если я так сделаю там же интерфейс function
                .map(elem -> elem *2)
                .forEach(elem -> System.out.print(elem + " "));
        System.out.println();
        System.out.println("-----------------избавимся от дублирующих значений ----------и увеличить все элем на 5 вывести---------------------------");
        list1.stream()
                .distinct()//избавляется от дублирующих значений  stateLess
                // есть еще stateLess( не изменяющее состояние ) и stateful( изменяющее состояние )
                .map(elem -> elem + 5)
                .forEach(elem -> System.out.print(elem + " "));
        System.out.println();
        // поиск из первых отрицательных
        //.findFirst() - возврощает самый первые элемент
        System.out.println(list1.stream().filter(elem -> elem < 0).findFirst().get());

        //.anyMatch() - возвращает boolean
        //есть ли 9 в коллекции
        System.out.println(list1.stream().anyMatch(elem -> elem == 0));
        //parallelStream -
        //сортировка положительных чисес 
        list1.stream().filter(elem -> elem >0).sorted().forEach(elem-> System.out.println(elem));

    }
}
