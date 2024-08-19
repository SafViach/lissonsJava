package lesson023.task2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//2. Даны два файла, содержащие по целочисленному массиву с пробелами между
//элементами. Считать массивы из файлов, создать коллекцию, содержащую четные
//элементы первого и отрицательные элементы второго. Полученную колллекцию записать
//в третий файл.
public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        int[] arrInt1 = new int[100];
        int[] arrInt2 = new int[100];

        final String INPUT = "src"+ File.separator+"lesson023"+File.separator+"task2"+File.separator+"data1.txt";

        final String INPUT2 = "src"+File.separator+"lesson023"+File.separator+"task2"+File.separator+"data2.txt";

        final String OUTPUT = "src"+File.separator+"lesson023"+File.separator+"task2"+File.separator+"data3.txt";


        try (BufferedReader br = new BufferedReader(new FileReader(INPUT));
        BufferedReader br1 = new BufferedReader(new FileReader(INPUT2));
        ){
            String line1=br.readLine().trim();
            String line2 = br1.readLine().trim();
            String[] arrLine1 = line1.split(" ");
            String[] arrLine2 = line2.split(" ");
            System.out.println(Arrays.toString(arrLine1));
            System.out.println(Arrays.toString(arrLine2));
            System.out.println("INT arr------------------------------------------------------");

            for (int i = 0; i < arrLine1.length; i++) {
                arrInt1[i]= Integer.valueOf(arrLine1[i]);
            }
            arrInt1 =Arrays.copyOf(arrInt1,arrLine1.length);
            System.out.println(Arrays.toString(arrInt1));
            for (int i = 0; i < arrLine2.length; i++) {
                arrInt2[i]= Integer.valueOf(arrLine2[i]);
            }
            arrInt2 =Arrays.copyOf(arrInt2,arrLine2.length);
            System.out.println(Arrays.toString(arrInt2));
            for (int i : arrInt1) {
                if (i%2==0)
                    list1.add(i);
            }
            for (int i : arrInt2) {
                if(i<0){
                    list1.add(i);
                }
            }
            for (Integer elem : list1) {
                System.out.println(elem);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT))){
            for (Integer elem : list1) {
                bw.write(elem.toString()+" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
