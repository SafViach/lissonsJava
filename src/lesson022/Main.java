package lesson022;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {

        //предопределенные потоки
        System.out.println(System.in.getClass().getSimpleName());
        System.out.println(System.out.getClass());
        System.out.println(System.err.getClass().getSimpleName());
        //в пердопределенный поток(связан с консолью ) вывода записали символ с кодом 97
        System.out.write(97);//записали в поток
        System.out.write(98);
        System.out.flush();//вытолкнули из потока
        System.out.println();

        for (int i = 0; i <128 ; i++) {
            System.out.write(i);
        }

        System.out.flush();//вытолкнули из потока
        Person person = new Person("slava");
        System.out.println();
        System.out.println("==============================");
        System.out.println(person.getClass().getSimpleName());
        System.out.write(7);

    }
}
