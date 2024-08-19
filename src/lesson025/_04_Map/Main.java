package lesson025._04_Map;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Map - интерфейс  <  а классы по иерархии - вид коллекций , который в качестве элемента храният сразу два связанных
        // логически между собой значения : ключ и значения
        // ключи хранятся только уникальные (не повторяемые ) однако под разными ключами могут быть одинаковые значения
        // HashMap -строится на основании хеш кодов ключей
        // LinkedHashMap - перебор будет в порядке добавления за счет ссылок каждой Node на следующтий элемент
        // TreeMap - перебор элементов в отсортированном по ключам 

        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1,"Petia");
        map1.put(9,"Petya");
        map1.put(8,"Grusha");
        map1.put(5,"Ira");//5
        map1.put(18,"Olya");//при перезаписи значения метод put возвращает то значение которое юыло заменено
        String tmp =map1.put(18,"O");// при попытке записать новое значение по существуещемму ключу , то произойдет перезапись значения
        //при перезаписи значения метод put возвращает то значение которое юыло заменено
        map1.put(21,"Vova");//5-коллизия

        System.out.println(map1);
        System.out.println(tmp);// то когго заменили
        System.out.println(map1.get(1));// из map по ключу возвращает значение стринг
        System.out.println(map1.get(11));// если по указанному ключу записи нет то возвращает null
        map1.putIfAbsent(18,"Osfsfefsdfef"); // ЗАПИСЫВАЕТ В MAP ЕСЛИ ПО ТАКОМУ КЛЮЧУ НИЧЕГО НЕТ
        System.out.println(map1);
        map1.replace(1,"Slava");//заменить
        System.out.println(map1);

        map1.keySet();// keySet - позволяет получить отдельно множество(set) ключей
        System.out.println(map1.keySet());

        System.out.println("----------------------------TEST-----------------------------");
        Set<Integer>set1 = map1.keySet();
        System.out.println(set1);
        System.out.println(map1.values());// коллекция только из значений (2 - ая часть коллекции ) коллекция непонятно какого типа
        for (Integer integer : set1) {
            System.out.println(integer);
        }

        //как из значения map получить ArrayList
        List<String> list1 = new ArrayList<>(map1.values());
        System.out.println("--------------------------------");
        System.out.println(list1);

        //Map.Entry// = интерфейс который определяет работу с элементом MAP при помощи мметодов getKey и getValue
        Set<Map.Entry<Integer,String>> entries = map1.entrySet();// работа с map  в виде как с set , где каждыи элементом является Entry  -
        //одна запись map

        //map нельзя перебрать foreach - поскольку он не индплементирует у iterable

        // но можно перебрать foreach  множество возвращаемое методом entrySet
        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
            System.out.println("ключ: " +entry.getKey() + " начение: "+entry.getValue());
        }
        // еще способ перебора

        System.out.println("----------------------------");
        for (Integer key : map1.keySet()) {
            System.out.println("ключ: " + key + " , значение: " + map1.get(key));
        }
    }
}
