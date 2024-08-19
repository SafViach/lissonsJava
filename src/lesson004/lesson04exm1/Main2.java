package lesson004.lesson04exm1;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        String str1 = null;
        str1 = "Java";
        //str1[0] нельзя обратиться как к элементу массива
        System.out.println(str1.charAt(2));//обращение к символу по индексу
        //System.out.println(str1.charAt(10)); ошибка

        str1 = str1.replace('a', '!');//заменяет указанный символ на указанный
        //в новой созданной строке и возвращает ее адрес
        System.out.println(str1);

        System.out.println(str1.length());//количество символов
        str1 = "Ivanva";
        str1 = str1.toUpperCase();//приводит к верхнему регистру
        System.out.println(str1);

        System.out.println(str1.indexOf("va"));//возвращает индекс первого совпадение
        //указанной подстроки в строке (-1 если не найдено)
        String str2 = str1.substring(2, 4);//от включительно до не включая
        System.out.println(str2);

        String str3 = "      Java      ";
        str3 = str3.trim();//удаляет лидирующие пробельные символы

        String str4 = "Petya;Grisha;Misha;Vasya";
        String[] names = str4.split(";");//разбивает сроку на массив строк
        //по указанному разделителю
        System.out.println(Arrays.toString(names));
        for (String name : names) {
            System.out.println(name);
        }


    }
}
