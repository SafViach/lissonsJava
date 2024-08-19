package lesson003;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size1 = 0;
        System.out.println("Введите кол-во элементов");
        size1 = scanner.nextInt();
        while (size1 <= 0) {
            System.out.println("Некорректный ввод, попробуйте еще раз");
            size1 = scanner.nextInt();
        }

        int[] arr1 = new int[size1];

        //System.out.println("Введите количество элементов второго массива");
        //int[] arr2 = new int[scanner.nextInt()];
        //можно не создавать переменную для хранения размерности при вводе

        //Math - класс содержит кучу полезных математических static методов
        //Math.random() возвращает случайное double [0;1)
        //заполнить массив случ числами от -5 до 5 включительно
        int from = -5, to = 5;

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * (to - from + 1) + from);
        }

        System.out.println(Arrays.toString(arr1));
        int counter = 0;

        for (int elem : arr1) {
            if (elem > 0) {
                counter++;
            }
        }
        System.out.println("Положительных: " + counter);

        //сортирует по возрастанию
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));


    }
}
