package lesson022;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        final int SIZE = 100;
        byte[] arr = new byte[SIZE] ;
        int index = 0 , tmp=0;

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("src/lesson022/in4.txt");
            while (index!=SIZE && tmp!=-1) {
                tmp = fis.read();
                arr[index++] = (byte)tmp;
            }
            System.out.flush();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(arr));
        try {
            arr = Arrays.copyOf(arr,index);
            System.out.write(arr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
