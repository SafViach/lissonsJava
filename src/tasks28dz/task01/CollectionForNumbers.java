package tasks28dz.task01;

import java.util.ArrayList;
import java.util.List;

public class CollectionForNumbers {
     static  private List<String> numbers = new ArrayList<>();

    static public void add (String number){
        numbers.add(number);
    }

     static public void printCollection (){
         for (String number : numbers) {
             System.out.println(number);
         }
     }
}
