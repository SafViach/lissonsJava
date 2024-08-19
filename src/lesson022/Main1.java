package lesson022;

import java.io.IOException;
import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        String str1 = "ab"; //английские
        String str2 = "аб"; //русские
        String str3 = "аb"; //b - английские  а - русская
        String str4 = "ыоакит атвалеотвк лпаетвтоотче ваотлкоо58а ваоеорегревап вшпаопррвервкв ваповроероароврпв";

        byte[] arr1 = str1.getBytes();
        byte[] arr2 = str2.getBytes();
        byte[] arr3 = str3.getBytes();
        byte[]arr4 = str4.getBytes();
        System.out.println( arr1.length);
        System.out.println( arr2.length);
        System.out.println( arr3.length);
        System.out.println(arr4.length);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        try {

            System.out.write(arr2);
            System.out.write(arr3);
        } catch (IOException exception) {
            exception.printStackTrace();
        }


    }
}
