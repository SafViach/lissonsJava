package dzLesson020byCollections.model;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        int maxList1 = 20;
        int negatives = 0;
        int plus = 0;
        int maxNumber = 0;
        int minNumber = 0;
        int indexMaxNumber=0;
        int indexMinNumber = 0;

        int from = -50 , to = 50;
        for (int i = 0; i < maxList1; i++) {
            int randomNumber = (int)(Math.random()*101)-to;
            list1.add(randomNumber);
        }
        for (Integer integer : list1) {
            if (integer >= 0){
                plus++;
            }else {
                negatives++;
            }
            System.out.println(integer);
        }
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i)>maxNumber){
                maxNumber = list1.get(i);
                indexMaxNumber = i;
            }else if (list1.get(i) < minNumber){
                minNumber = list1.get(i);
                indexMinNumber = i;
            }
        }
        System.out.println("кол-во положительных = " + plus + " кол-во отрицательных " + negatives );
        System.out.println("самое минимальное значение = "+ minNumber + " самоек максимальное число = " + maxNumber);
        System.out.println("индекс минимального значения = " + indexMinNumber + " индекс максимального значения "+ indexMaxNumber);
        List<Integer> list2;
        System.out.println("новая коллекция готова");
        try {
            list2 = new ArrayList<>(list1.subList(indexMinNumber,indexMaxNumber));
            for (Integer integer : list2) {
                System.out.println(integer);
            }
        } catch (Exception e) {
            list2 = new ArrayList<>(list1.subList(indexMaxNumber,indexMinNumber));
            for (Integer integer : list2) {
                System.out.println(integer);
            }
        }
        System.out.println("коллекция без отрицацельных значений");
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i)<0) {
                list2.remove(i);
                i--;
            }
        }
        System.out.println("без отрицательных значений:");
        for (Integer integer : list2) {
            System.out.println(integer);
        }
        System.out.println("каждое четный индекс имеет 0");
        for (int i = 0; i < list2.size(); i++) {
            if (i % 2 != 0)
                list2.set(i,0);
        }
        System.out.println(list2);


    }
}
