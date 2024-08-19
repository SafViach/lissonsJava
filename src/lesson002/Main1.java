package lesson002;

public class Main1 {
    public static void main(String[] args) {
        //величины: переменные и константы
        //final - величины, которое можно проинициализировать один раз
        final int X = 10;
        final int MAX_SIZE = 20, SIZE;
        SIZE = 60;
        //SIZE = 70; провторная инициализация запрещена
        int age = 50, myAge = 60;

        byte b1 = 0;//при объявления переменная должна быть проинициализирована
        System.out.println(b1);

        //продвижение типов данных в арифметике
        byte bb2 = 3, b3 = 10, b4 = 0;
        //byte  short  int -> int
        b4 = (byte) (bb2 + b3);// byte + byte -> int
        System.out.println("b4 = " + b4);
        short s1 = 15, s2 = 0;
        s2 = (short) (s1 + bb2);//short + byte -> int
        System.out.println("s2 = " + s2);
        int i1 = 0;
        i1 = s1 + bb2;

        // bute short int long  ->   long
        long l1 = 1, l2 = 3000000000l, l3 = 0;
        l3 = bb2 + l2;
        i1 = (int) (bb2 + l2);//возможно потеря данных

        //явное преобразование типов данных избавит от ошибки компиляции но не гарантирует
        //корректный результат изза возможной потери данных

        float f1 = 6.5f, f2 = 3.0f, f3 = 0;//явно указываем для компилятора что значение типа float
        double d1 = 6.5, d2 = 3.0, d3 = 0;
        //byte short int long float  -> float
        f3 = f1 + f2 + bb2 + s2 + l2 + i1;
        System.out.println(f3);
        //byte short int long float double  -> double
        d3 = f1 + f2 + bb2 + s2 + l2 + i1 + d1;
        System.out.println(d3);
    }
}
