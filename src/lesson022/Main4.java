package lesson022;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        //считать всю информацию из файла и вывести на консоль
        FileInputStream fis = null;
        final int SIZE = 100;
        byte[] arr = new byte[SIZE];
        int index = 0, tmp = 0;

        try {
            fis = new FileInputStream("src/lesson022/in4.txt");// создание потока связанного с файлом для ввода (считывания)
            tmp = fis.read();
            //while (tmp!=-1 && index <100)//пока не конец файла и пока не считали 100 байт
            //fis.read(); возвращает код байта или -1 если считывать нечего
            while (tmp!=-1 && index <100) {//пока не конец файла и пока не считали 100 байт
                arr[index++] = (byte)tmp;//считанный код из файла методом добавляем в массив
                tmp = fis.read();
            }
        } catch (FileNotFoundException  exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }


        try {
            arr = Arrays.copyOf(arr,index);
            System.out.write(arr);
            System.out.flush();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
