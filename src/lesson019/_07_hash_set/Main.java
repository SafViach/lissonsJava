package lesson019._07_hash_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main{
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(55);
        set1.add(49);
        set1.add(64);
        set1.add(30);
        set1.add(15);
        set1.add(100);

        System.out.println(set1);

        set1.add(49);//хеш сет не позволяет хранить дубликаты элементов
        //при попытке положить объект в хеш сет высчитывает его хеш_код % размер_таблицы
        //(берется остато от деления хеш кода на размер таблицы)
        //данное значение это и есть позиция в хеш сете. Если в такой позиции уже есть
        //элемент, то при помощи метода equals происходит их сравнение.
        //если equals дает true то элемент не добавляется. Если false то организыется
        //связанный список в этой позиции хеш сета. При превышении списка в 8 элементов
        //он перестраиваетчся в красно черное дерево

        set1.add(71);//число с такой же позицией добавлено

        System.out.println(set1);


    }
}
