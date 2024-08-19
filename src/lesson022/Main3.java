package lesson022;

import javax.sound.midi.Soundbank;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) {
        int  x = 0;

        try {
            System.out.println("Введите англ символ");
            x = System.in.read();
            System.out.println("то что ввёл пользователь" + x);
            System.out.write(x);
            System.out.flush();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        System.out.println();
        try {
            System.in.skip(1);//пропустит 1 байт потока (интер)
            System.in.skip(System.in.available());// пропустить все байты потока
            System.out.println("Введите русский символ");
            x = System.in.read();
            System.out.println("то что ввёл пользователь" + x);
            System.out.write(x);
            x = System.in.read();
            System.out.write(x);
            System.out.flush();
        } catch (IOException exception) {
            exception.printStackTrace();
        }


    }
}
