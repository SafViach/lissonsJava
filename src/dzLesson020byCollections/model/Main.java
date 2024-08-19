package dzLesson020byCollections.model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Integer>list1 = new ArrayList<>();
        int maxList1 = 15;

        int from = -50 , to = 50;
        for (int i = 0; i < maxList1; i++) {
            int randomNumber = (int)(Math.random()*101)-to;
            list1.add(randomNumber);
        }
        for (Integer integer : list1) {
            System.out.println(integer);
        }
        System.out.println("------------------------размер коллекции---------------------------");
        System.out.println(list1.size());
        System.out.println("--------------------------------------7 индекс--------------------------------");
        System.out.println(list1.get(7));
        System.out.println("------------------------------------есть ли значение 8 в коллекции------------------------------------------------");
        boolean res = list1.contains(8);
        int counter = 0;
        int i = 0;
        for ( i = 0; i < list1.size(); i++) {
            if (list1.get(i)==8){
                break;
            }
            counter++;
        }
        if (res == true) {
            System.out.println(list1.get(counter));
        }else {
            System.out.println("нет 8 - ки");
        }
        System.out.println("----------------------------------------удаляем 3 - ый по индексу элемент---------------------------------------");
        list1.remove(3);
        System.out.println("теперь кол-во коллекции состовляет = " + list1.size() );
        for (Integer integer : list1) {
            System.out.println(integer);
        }
        System.out.println("-------------добавляем новое значение 100 по индексу 5 --------------------------");
        list1.add(5,100);
        for (Integer integer : list1) {
            System.out.println(integer);
        }
        System.out.println("теперь кол-во коллекции состовляет = " + list1.size() );
        System.out.println("---------------------------------------------------------------");


    }
}
