package dzLesson020byCollections.model;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();

        list1.add("Minsk");
        list1.add("Gomel");
        list1.add("Mogiley");
        list1.add("Vitebsk");
        list1.add("Brest");

        String poisk = "Mogiley";

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) == poisk){
                list1.remove(i);
            }
        }
        for (String s : list1) {
            System.out.println(s);
        }
        list1.remove(2);
        System.out.println(list1.size());
        System.out.println(list1);
    }
}
