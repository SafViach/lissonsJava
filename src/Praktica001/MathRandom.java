package Praktica001;

import java.util.*;

public class MathRandom {
    public static void main(String[] args) {
        final int SIZE = 10;
        final int TO = 10;
        final int FROM = 30;
        List<Integer> integers = new ArrayList<>();
        List<Integer> integers1 = new LinkedList<>();
        for (int i = 0; i < SIZE; i++) {
            integers.add((int)(Math.random() * (TO - FROM+1) + FROM));
            integers1.add((int)(Math.random()* (TO - FROM + 1) + FROM));
        }
        System.out.println(integers);
        System.out.println(integers1);

        Iterator<Integer> iterator = integers.iterator();

        while (iterator.hasNext()){
            Integer count = iterator.next();
            System.out.println(count);
        }
        System.out.println(integers);
        iterator = integers.iterator();
        while(iterator.hasNext()){
            Integer elem = iterator.next();
            iterator.remove();
        }
        System.out.println(integers);
    }
}
