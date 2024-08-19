package lesson015.exm1;

import lesson015.exm1.model.A;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main2 {
    //пробасывть исключения из main считаем плохим тоном
    public static void main(String[] args) {

        try{
            FileReader fileReader = new FileReader("1.txt");//new FileNotFoundException
        }catch (FileNotFoundException exception){
            System.out.println(exception);
        }




        A a1 = new A();
        try {
            A a2 =(A) a1.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Нельзя клонировать");
        }

    }
}
