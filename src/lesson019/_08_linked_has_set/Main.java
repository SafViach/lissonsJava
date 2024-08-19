package lesson019._08_linked_has_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(55);
        set1.add(49);
        set1.add(64);
        set1.add(30);
        set1.add(15);
        set1.add(100);

        System.out.println(set1);

        set1.add(49);//хеш сет не позволяет хранить дубликаты элементов

        set1.add(71);//число с такой же позицией добавлено
        System.out.println(set1);
    }
}
