package lesson025_dz_task01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------HashMap-------------------------------------------------------------");

        Map<String,Integer> regionsHM = new HashMap();
        regionsHM.put("Брест",1);
        regionsHM.put("Витебск",2);
        regionsHM.put("Gomel",3);
        regionsHM.put("Гродно",4);
        regionsHM.put("Минск",5);
        regionsHM.put("Могилёв",6);
        System.out.println("-----------------------------------------вывод HashMap-------------");
        for (String s : regionsHM.keySet()) {
            System.out.println(s);
        }
        System.out.println("-----------------------------------------");
        Set<Map.Entry<String,Integer>>entries=new HashSet<>(regionsHM.entrySet());
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.print(" Ключ: "+ entry.getKey()+ "Значение: "+ entry.getValue());
        }
        System.out.println();
        System.out.println("--------------------------LinkedHashMap-------------------------------------------------------------");
        Map<String,Integer> regionsLHM = new LinkedHashMap<>();
        regionsLHM.put("Брест",1);
        regionsLHM.put("Витебск",2);
        regionsLHM.put("Gomel",3);
        regionsLHM.put("Гродно",4);
        regionsLHM.put("Минск",5);
        regionsLHM.put("Могилёв",6);
        System.out.println("-----------------------------------------вывод LinkedHashMap-------------");
        for (String s : regionsLHM.keySet()) {
            System.out.println(s);
        }
        Set<Map.Entry<String,Integer>>entrySet=new HashSet<>(regionsLHM.entrySet());
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.print(" Ключ: "+ entry.getKey()+ "Значение: "+ entry.getValue());
        }
        System.out.println();
        System.out.println("--------------------------TreeMap-------------------------------------------------------------");
        Map<String,Integer> regionsTM = new TreeMap<>();
        regionsTM.put("Брест",1);
        regionsTM.put("Витебск",2);
        regionsTM.put("Gomel",3);
        regionsTM.put("Гродно",4);
        regionsTM.put("Минск",5);
        regionsTM.put("Могилёв",6);
        System.out.println("-----------------------------------------вывод TreeMap-------------");
        for (String s : regionsTM.keySet()) {
            System.out.println(s);
        }
        Set<Map.Entry<String,Integer>>hashSet=new HashSet<>(regionsLHM.entrySet());
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.print(" Ключ: "+ entry.getKey()+ "Значение: "+ entry.getValue());
        }

    }
}
