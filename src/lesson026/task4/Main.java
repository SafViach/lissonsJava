package lesson026.task4;

import lesson026.task5.model.Faculty;
import lesson026.task5.model.StudentsUtil;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Set<String>> cities = new TreeMap<>();
        Set<Map.Entry<String, Set<String>>> citi = cities.entrySet();


        //добавили запись в мап ключ - Гомель, значение - пустая коллекция TreeSet
        cities.put("Гомель", new TreeSet<>());

        //cities.get("Гомель") получаем значение мап, связанное с ключом "Гомель",
        //этим значением является пока пустая коллекция TreeSet
        cities.get("Гомель").add("Мозырь");
        cities.get("Гомель").add("Речица");
        cities.get("Гомель").add("Калинковичи");

        cities.put("Могилев", new TreeSet<>());
        cities.get("Могилев").add("Кировск");
        cities.get("Могилев").add("Осиповичи");
        cities.get("Могилев").add("Быхов");

        for (Map.Entry<String, Set<String>> region : cities.entrySet()) {
            System.out.println("Областной центр:" + region.getKey());
            System.out.println("Районные центры:");
            for (String district : region.getValue()) {
                System.out.println(district);
            }
        }
        System.out.println("------------------------удалить все что связано с могилёвом -------------------");

        Iterator<Map.Entry<String,Set<String>>> iterator = cities.entrySet().iterator();
//        while(iterator.hasNext()){
//            Map.Entry<String,Set<String>>elem = iterator.next();
//            if (elem.getKey()=="Могилев"){
//                iterator.remove();
//            }
//        }
        System.out.println(cities);
        System.out.println("------------------------удалить все что связано с могилёвом 2-------------------");
        Set<String> cmp =cities.get("Могилев");
        Iterator <String> iterator1 = cmp.iterator();
        while (iterator1.hasNext()){
            String elem1 = iterator1.next();
            iterator1.remove();
        }
        //удалил конкоетно только все что связано с могилёвон но не сам могилёв )))
        System.out.println(cmp);
        System.out.println(cities);
        System.out.println("------------------------удалить речица-------------------");
        cities.get("Гомель").remove("Речица");
        System.out.println(cities);
        cities.get("Гомель").add("Мозырь2");
        System.out.println(cities);



    }
}
