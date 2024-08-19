package lesson025._01_hash_set;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("Гомель");
        set1.add("Минск");
        set1.add("Могилёв");
        set1.add("Гродно");
        set1.add("Брест");
        set1.add("Витебск");
        set1.add("Витебск");//не добавится
        System.out.println(set1);
    }
}
