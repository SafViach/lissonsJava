package lesson034_dz_streamApi.task1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //1. Создать коллекцию целых чисел
        //1.1 Вывести не более 4 положительных чисел
        //1.2 Отсортировать числа по возрастанию и поместить их в новую коллекцию ArrayList
        //1.3 Отсортировать числа по убыванию и поместить их в новую коллекцию Set
        //1.4 Получить уникальные значения коллекции, которые по значению больше 10 и
        //поместить их в новую коллекцию.
        //1.5 Подсчитать сумму и среднее арифметическое используя reduce текущего стрима
        //1.6 Найти максимальное и минимальное значение текущего стрима
        //1.7 Подсчитать сумму и среднее арифметическое используя IntStream
        //1.8 Найти максимальное и минимальное значение используя IntStream

        List<Integer> list = new ArrayList<>(List.of(2,6,34,89,-54,7,34,87,-76,-5,45,65,99,543,-65,-3432,76,9));

        System.out.print("1.1 Вывести не более 4 положительных чисел : ");
        final int LIMIT_COUNT = 4;
        list.stream()
                .filter(elem->elem > 0 )
                .limit(LIMIT_COUNT)
                .forEach(elem-> System.out.print(elem+ " "));
        System.out.println();

        System.out.println("1.2 Отсортировать числа по возрастанию и поместить их в новую коллекцию ArrayList");
        List<Integer> newList =list.stream().
                sorted().
                collect(Collectors.toList());
        newList.forEach(elem-> System.out.print(elem+ " "));
        System.out.println(newList.getClass().getSimpleName());

        System.out.println("//1.3 Отсортировать числа по убыванию и поместить их в новую коллекцию Set");
        Set<Integer> newList2 =list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toCollection(()->new LinkedHashSet<>()));
        newList2.forEach(elem-> System.out.print(elem + " "));
        System.out.println(newList2.getClass().getSimpleName());

        System.out.println("1.4 Получить уникальные значения коллекции, которые по значению больше 10 и\n" +
                "поместить их в новую коллекцию.");
        final int MIN_NUMBER = 10;
        Set<Integer> newList4 = list.stream()
                .filter(elem->elem > MIN_NUMBER)
                .collect(Collectors.toCollection(TreeSet::new));// + сортированная коллекция будет
        newList4.forEach(elem -> System.out.print(elem + " "));
        System.out.println();

        System.out.println("//1.5 Подсчитать сумму и среднее арифметическое используя reduce текущего стрима");
        double avg = list.stream()
                .reduce((elem1 , elem2) -> elem1+elem2).get()/list.size();
        System.out.println(avg);

        System.out.println("1.6 Найти максимальное и минимальное значение текущего стрима");
        //System.out.println("максимальное значение в коллекции: "+Collections.max(list));
        //System.out.println("миниимальное значение в коллекции: "+Collections.min(list));
        int maxElem = list.stream()
                .max(Comparator.naturalOrder()).get();
        int minLEM = list.stream()
                .min(Comparator.naturalOrder()).get();
        System.out.println("максимальное значение в коллекции: "+ maxElem);
        System.out.println("миниимальное значение в коллекции: "+minLEM);

        System.out.println("1.7 Подсчитать сумму и среднее арифметическое используя IntStream");
        int sum = list.stream().mapToInt(elem -> elem)
                .sum();
        double avg2 = list.stream().mapToInt(elem->elem).average().getAsDouble();
        System.out.println("свмма : "+ sum + " среднее арифметическое :" + avg2);

        System.out.println("1.8 Найти максимальное и минимальное значение используя IntStream");
        int maxElem2 = list.stream()
                .mapToInt(elem->elem)
                .max().getAsInt();
        int minElem2 = list.stream()
                .mapToInt(elem->elem)
                .min().getAsInt();
        System.out.println("максимальное значение в коллекции: "+ maxElem2);
        System.out.println("миниимальное значение в коллекции: "+ minElem2);
    }
}
