package lesson004.lesson04exm1;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        //для работы с текстами(строками) есть три класса
        //String; - неизменяемые строки, любая попытка изменения строки приведет
        //к созданию нового объекта (immutable класс)
        //StringBuilder; изменяемые, не синхронизирован, для работы без многопоточности
        //StringBuffer; изменяемые, синхронизирован, для работы в многопоточных приложения

        //new - операция динамического выделения памяти (создание объекта)
        String str1 = new String("Igor");//занимает 4 байта
        String str2 = "Igor";
        String str3 = "Игor";//занимает 6 байт
        String str4 = "Igor";
        String str5 = new String("Igor");

        //String начиная с 7 версии под капотом представляет массив типа byte
        //адаптивное хранение символов (1 (если код до 127), 2 (больше 127))
        //str1.getBytes() возвращет строку в виде массива байт

        System.out.println(Arrays.toString(str1.getBytes()));
        System.out.println(Arrays.toString(str3.getBytes()));

        //сравния ссылки через == сравнивается не объекты по ссылкам, а хранящиеся адреса
        System.out.println(str1 == str2);//false - разрые ссылки на одинаковые объекты
        System.out.println(str2 == str4);//true - две ссылки на один и тот же объект из string pool

        //str1.equals(str2) сравнит на равенство объекты по ссылкам
        System.out.println(str1.equals(str2));//объекты находятся по разным ссылкам, но они идентичны
        System.out.println(str1.equals(str3));//объекты не одинаковы

        str1 = str1.intern();//если строка по str1 уже есть в string pool, то возвращает адрес строки из string pool
        //если нет, то помещает ее туда и возвращает

    }
}
