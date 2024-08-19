package lesson019._03_array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //создана коллекция в которой можно работать с содержимым поэлементно поиндексно
        //под капотом массив типа Object, по умодчанию из 10 элементов
        //при попытке добавить в заполненный увеличивается на 50%
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println(list1.size());//тек кол-во элементов
        list1.add(5);//добавление в конец массива
        list1.add(8);
        list1.add(1);
        list1.add(-7);
        list1.add(4);
        list1.add(15);
        list1.add(5);
        System.out.println(list1.size());
        System.out.println(list1);//вывод при помощи toString()
        System.out.println("-------");
        for (Integer elem : list1) {//перебор элементов
            System.out.println(elem);// коллекции и их вывод
        }
        System.out.println("--------------");
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");//доступ к каждому отдельному элементу по
            // индексу через метод get ----- list1.get(0);
        }
        System.out.println("--------------");
        list1.add(0, 45);//вставка элемента по указанному идексу
        System.out.println(list1);

        System.out.println("Удаление");
        list1.remove(1);//удалим пятерку по 1 индексу
        System.out.println(list1);
        list1.remove((Integer) 15);//удалить по значению
        System.out.println(list1);

        //если в коллекции есть -7 то вывести его индекс
        //list1.contains(элем) определит есть ли элемент в коллеекции
        // list1.indexOf(елем) вернет индекс
        if (list1.contains(-7)) {
            System.out.println("Индекс -7: " + list1.indexOf(-7));
        }

        list1.set(0, 10);//меняем нулевой элемент на 10
        System.out.println(list1);

        //на основе неизменяемой коллекция создалась коллеция ArrayList,
        //которую можно изменять
        ArrayList<Integer> list2 = new ArrayList<>(List.of(21, -34, 50));

        list1.addAll(list2);//объединение двух коллекций
        System.out.println(list1);


        ArrayList<Integer> list3 = new ArrayList<>(list1.subList(2, 6));//[от, до)
        System.out.println("Подколлекция");
        System.out.println(list3);
        System.out.println(list1.subList(2, 6));
        for (Integer elem : list1.subList(2, 6)) {//вывод части коллекция foreach
            System.out.println(elem);
        }

        System.out.println("Сортировка");
        //Collections - класс с полезными static методами для коллекций
        Collections.sort(list1);//сортируется по приципу compareTo
        System.out.println(list1);
        Collections.sort(list1, Comparator.reverseOrder());//по обратному принципу
        //compareT0
        System.out.println(list1);

        //макс и мин работает в случае реализация Comparable либо
        //указания Comparator
        System.out.println(Collections.max(list1));


        int counter = 0;

        for (Integer elem : list1) {
            if (elem % 2 == 0) {
                counter++;
            }
        }
        System.out.println(counter);


    }
}
