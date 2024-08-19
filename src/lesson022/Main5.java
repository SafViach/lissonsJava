package lesson022;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main5 {
    public static void main(String[] args) {
        //считать всю информацию из консоли до символа <!> и записать её в файл

        final int SIZE = 100;
        byte[] arr = new byte[SIZE];
        int index = 0, tmp = 0;

        try {
            //.in.read() = считывает из консоли
            //считываем байт из консоли его код записываем в tmp и сравниваеи с кодом <!>
            System.out.println("Водите текст , окончание ввода = <!>");
            while ((tmp=System.in.read())!='!'&& index <SIZE){
                   arr[index++] = (byte)tmp;
            }
            arr= Arrays.copyOf(arr,index);

        } catch (IOException exception) {
            exception.printStackTrace();
        }
        //чтобы записать информацию в файл = нужно создать поток вывода
        //если файла в который выводится информация не существует то поток его создаст самостоятельно

        //try  with resources  - открыли поток и он сам закроет поток автомотически

        //try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/lesson022/in4.txt"))){//удаляет и создаёт новый

        //try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/lesson022/in4.txt",true))){продолжает заполнять файл

        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/lesson022/in4.txt"))){
            bos.write(arr);
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }


    }
}
