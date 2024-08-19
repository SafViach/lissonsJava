package lesson022;

import java.io.*;

public class DzLesoon06 {
    public static void main(String[] args) {
        final int SIZE = 100;
        byte[] arr = new byte[SIZE];
        int index=0,tmp=0;

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/lesson022/in4.txt"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/lesson022/in6.txt"))){

            while (bis.read()!=-1&&index<SIZE){
                while (bis.read()>=0&&bis.read()<=10){
                    bos.write(bis.read());
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
