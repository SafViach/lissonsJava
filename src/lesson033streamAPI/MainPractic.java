package lesson033streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainPractic {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(4,7,12,56,-34,-65,3,67,-54,3,0,54,-7,0,43,-67));
        //практикуемся
        //вывожу коллекцию с помощью метода .forEach из коллекции
        numbers.forEach(o-> System.out.print(o + " "));
        System.out.println();
        //вывожу коллекцию с помощью метода .forEach из stream
        numbers.stream().forEach(o-> System.out.print(o + " "));
        System.out.println();
        //вывести все элементы положительные и кол-во положительных
        numbers.stream().filter(o->o > 0).forEach(o-> System.out.print(o + " "));
        int colPolNumbers = (int)numbers.stream().filter(o->o > 0).count();
        System.out.println();
        System.out.println("кол-во положительных в коллекции :" + colPolNumbers);
        //отсортировать коллекцию
        System.out.println();
        numbers.stream().sorted().forEach(o-> System.out.print(o + " "));
        System.out.println();

    }
}
