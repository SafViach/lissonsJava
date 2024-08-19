package tasks28dz.task02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListJava {
    private static List<String> arrJava = new ArrayList<>();

    public static void add(String str){
        arrJava.add(str);
    }

    public static void printArrJava(){
        for (String s : arrJava) {
            System.out.println(s);
        }
    }
    public static Iterator iterator(){
        Iterator iterator = arrJava.iterator();
        return iterator;
    }
}
