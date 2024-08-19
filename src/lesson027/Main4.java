package lesson027;
public class Main4 {
    public static void main(String[] args) {

        //email любые лат символ, цифры, нижн подчерк, тире, точка
        //@
        //лат символы от 2 до 6
        //.
        //лат симв 2 до 4

        //внутри множества не нужно экранировать . + * ?
        //внутри регулярки вне множества нужно экранировать для восприятия ее как
        //символа точка
        String regex = "\\s*[\\w.-]{2,}@[A-Za-z]{2,6}\\.[A-Za-z]{2,4}\\s*";

        String str1 = "ivanov@gmail.com";
        String str2 = "  lentiay228@mail.ru ";
        String str3 = "123@yandex.ru";
        String str4 = "ivanov_ivan.Ivanovich-Ivanovski@gmail.com";
        String str5 = "q@mail.ru";
        String str6 = "qwerty456gmail.com";
        String str7 = "qwerty!qwert@mail.ru";
        String str8 = "qwery@mail!ru";


        System.out.println(str1.matches(regex));
        System.out.println(str2.matches(regex));
        System.out.println(str3.matches(regex));
        System.out.println(str4.matches(regex));
        System.out.println(str5.matches(regex));
        System.out.println(str6.matches(regex));
        System.out.println(str7.matches(regex));
        System.out.println(str8.matches(regex));


    }
}
