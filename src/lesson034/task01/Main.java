package lesson034.task01;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(List.of(4, 8, -4, 0, -3, 10, 0, -10, 9, 8, 15, 20, 12, -10));


        //1.1 Вывести не более 4 положительных чисел
        final int LIM_COUNT = 4;
        list1.stream()
                .filter(elem -> elem > 0)
                .limit(LIM_COUNT)//пропустит дальше не больше указанного количества
                .forEach(elem -> System.out.println(elem));
        System.out.println("----------------------------");
        //ссылки на методы - сокращенная форма записи некорых лямбд
        //возможно только для лямбд тело которых состоит из вызова одно метода
        list1.stream()
                .filter(elem -> elem > 0)
                .limit(LIM_COUNT)//пропустит дальше не больше указанного количества
                .forEach(System.out::println);// elem -> System.out.println(elem)

        //1.2 Отсортировать числа по возрастанию и поместить их в новую коллекцию ArrayList

        //если нужно отсортировать текущую коллекцию, то стрим не используют
        //Collections.sort(list1); для задачи не подходит потому что изменит текущую
        //.collect(Collector) метод требует объект типа Collector (интерфейс)
        //Collectors содержит статические методы создающие объекты реализующие интерфейс Collector\
        //Collectors.toList() создает коллектор, который соберет поток в коллекцию ArrayList
        System.out.println("------------------------");
        List<Integer> list2 = list1.stream()
                .sorted()
                .collect(Collectors.toList());//терминальная

        System.out.println(list2.getClass().getSimpleName());
        list2.forEach(elem -> System.out.print(elem + " "));
        System.out.println();

        //1.3 Отсортировать числа по убыванию и поместить их в новую коллекцию Set
        //Comparator.reverseOrder() дефолтный метод интерфейса, который создает компаратор, по принципу
        //обратному compareTo
        System.out.println("---------------------------");
        Set<Integer> set1 = list1.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toSet());
        //по умолчанию формирует HashSet
        System.out.println(set1.getClass().getSimpleName());
        set1.forEach(elem -> System.out.print(elem + " "));
        System.out.println();

        //если нужно из стрима получить например LinkedHashSet

        System.out.println("---------------------------");
        Set<Integer> set2 = list1.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toCollection(() -> new LinkedHashSet<>()));
        //.collect(Collectors.toCollection(LinkedHashSet::new); альтернатива лямбды, ссылка на конструктор
        System.out.println(set2.getClass().getSimpleName());
        set2.forEach(elem -> System.out.print(elem + " "));
        System.out.println();

        //Получить уникальные значения коллекции, которые по значению больше 10 и
        //поместить их в новую коллекцию.
        System.out.println("-----------------------------------");
        //так как мы решили получить коллекцию set, то distinct вызывать нет смысла
        Set<Integer> set3 = list1.stream()
                .filter(elem -> elem > 10)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set3.getClass().getSimpleName());
        set3.forEach(elem -> System.out.print(elem + " "));
        System.out.println();

        //1.5 Подсчитать сумму и среднее арифметическое используя reduce текущего стрима
        System.out.println("-------------------------");

        //(1)reduce один аргумент BinaryOperator
        //нужно дать два объекта, с ними что-то сделать и вернуть результат
        //однако данный метод возвращает Optional, то есть результат будет завернут в этот объект
        //чтобы достать объект заврнуты й в Optional есть метод get

        int sum1 = list1.stream()
                .reduce((elem1, elem2) -> elem1 + elem2).get();
        System.out.println("Сумма: " + sum1);


        double avg1 = sum1 / list1.size();
        System.out.println(avg1);

        //если бы пришлось работать только с полож элементами

        int sum2 = list1.stream()
                .filter(elem -> elem > 0)
                .reduce((elem1, elem2) -> elem1 + elem2).get();
        System.out.println("Сумма: " + sum2);//отдельно суммируем

        int size2 = (int) list1.stream()
                .filter(elem -> elem > 0)
                .count();//отдельно считаем

        double avg2 = sum2 / size2;
        System.out.println(avg2);

        //Найти максимальное и минимальное значение текущего стрима

        System.out.println("-----------------------");
        int max1 = list1.stream().max(Comparator.naturalOrder()).get();
        System.out.println("максимальное:" + max1);

        //для удобства расчетов с числами существуют IntStream, DoubleStream, LongStream
        //их можно получить из обычного Stream

        //1.7 Подсчитать сумму и среднее арифметическое используя IntStream
        //.mapToInt() вернет поток типа IntStream
        int sum3 = list1.stream().mapToInt(elem -> elem).sum();
        double avg3 = list1.stream().mapToInt(elem->elem).average().getAsDouble();
        System.out.println("Сумма: " + sum3);
        System.out.println("Ср арифм: " + avg3);

        //1.8 Найти максимальное и минимальное значение используя IntStream
        int max2 = list1.stream().mapToInt(elem->elem).max().getAsInt();
        System.out.println("Макс: " + max2);

    }
}
