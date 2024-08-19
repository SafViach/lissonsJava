package lesson027;
public class Main3 {
    public static void main(String[] args) {
        String str1 = "Vasya";
        String str2 = "Grisha ";
        String str3 = "   Olya";
        String str4 = "   Vika   ";
        String str5 = "ira";
        String str6 = "Gal123ya";

        //[A-Z] одна из букв латинского алфита верхнего регистра
        //[a-z] одна из букв латинского алфита нижнего регистра
        //[A-Za-z] любая буква латинского алфавита
        //[0-9] любая цифра
        //[a-d] любая из от a до d

        String regex1 = " *[A-Z][a-z]+ *";
        System.out.println(str1.matches(regex1));
        System.out.println(str2.matches(regex1));
        System.out.println(str3.matches(regex1));
        System.out.println(str4.matches(regex1));
        System.out.println(str5.matches(regex1));
        System.out.println(str6.matches(regex1));

        //Классы содержащие множества
        //в общем синтаксисе регулярок \d, в Java \\d
        // .(точка)	абсолютно любой символ
        //   \\d	цифра: [0-9]
        //   \\D	не цифра: [^0-9]

        //    \\s	пробельный символ [ \t\n\x0B\f\r]
        //    \\S	не пробельный [^\s]

        //\w	лат буква, цифра и нижнее подчеркивание [a-zA-Z_0-9]
        //\W	все кроме вышеперечисленного

        System.out.println("----------------");
        String regex2 = "\\s*\\p{Upper}\\p{Lower}+\\s*";
        System.out.println(str1.matches(regex2));
        System.out.println(str2.matches(regex2));
        System.out.println(str3.matches(regex2));
        System.out.println(str4.matches(regex2));
        System.out.println(str5.matches(regex2));
        System.out.println(str6.matches(regex2));

    }
}
