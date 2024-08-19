package lesson012.lesson12._01_wrapper;

public class Main {
    public static void main(String[] args) {

        //классы обертки(оболочки)
        int x1 = 10;//на примитиве недоступен вызов методов
        //Integer x2 = new Integer(15);//упаковка (boxing)
        //x2 можно вызывать методы описанные внутри класса Integer

        //распаковка (unboxing)
        //int x3 = x2.intValue();//вернет значение поля объекта

        //автоупаковка (autoboxing)
        Integer x4 = 20;//new Integer(20)

        //автораспаковка (autounboxing)
        int x5 = x4;//x4.intValue()

        //Integer res = x2 + x4;
        //System.out.println(res);

        //как из строки получить число
        String str1 = "123";
        int x6 = Integer.valueOf(str1);

        Double d1 = 13.6;
        Double d2 = 2.5;
        //Double.compare(d1, d2)

        Object[] objects = {
                new String("sdegsw"),
                "sdjghs",
               // new Integer(4),
                5
        };


    }
}
