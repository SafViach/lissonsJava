package lesson027;

public class Main {
    public static void main(String[] args) {
        //регулярные выражения   Regular expressions      RegEx    regex      = одно и тоже
             //регулярные выражения - это средство позволяющее проверить соответствует ли некотороя строка  или подстрока
        // определённому шаблону

        // регулярки обладают своим собстрвенным синтаксисом построения шаблона для проверки , не привязываются к конкретному языку
        //   программирования
                                 //работа с регулярками в java
        // 1) методы String = matches() и split()
        // 2) классы Pattern и Matcher

        // по сути регулярка это обьект класса String  записанный по определённому синтаксису

        //элементы синтаксиса регулярок
        // 1 - кванторы , квантификаторы - определяют сколько раз может встречаться символ слева от квантора
        // {1,5}от 1 до 5 раз
        // {1, } от 1 до беск
        // { , 5} до 5 раз
        // ? - либо встречается 1 раз либо вообще не встречается
        // + - встречается от 1 до бесконечности раз
        // * - встречается от 0 до бесконечности раз {0, }
        //{8} - обязательно 8 символов

        // множество [...] один из перечисленных внутри символов

        String str1 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;

        str1 = "java";
        str2 = " java";
        str3 = "java ";
        str4 = "Java";
        str5 = "jaava";
        str6 = "    jaaaava     ";

        //регулярные выражение может быть совокупностью символов
        String regex1 ="java";
        System.out.println(str1.matches(regex1));//совпало с первым
        System.out.println(str2.matches(regex1));
        System.out.println(str3.matches(regex1));
        System.out.println(str4.matches(regex1));
        System.out.println(str5.matches(regex1));
        System.out.println(str6.matches(regex1));
        System.out.println("---------------------------------------------------------");
        String regex2 = " java ";
        System.out.println(str1.matches(regex2));// нет совпадений
        System.out.println(str2.matches(regex2));
        System.out.println(str3.matches(regex2));
        System.out.println(str4.matches(regex2));
        System.out.println(str5.matches(regex2));
        System.out.println(str6.matches(regex2));
        System.out.println("---------------------------------------------------------");
        String regex3 = " *java";// перед словом может быть сколько угодно пробелов , а может и не быть и вовсе
        System.out.println(str1.matches(regex3));
        System.out.println(str2.matches(regex3));//true
        System.out.println(str3.matches(regex3));
        System.out.println(str4.matches(regex3));
        System.out.println(str5.matches(regex3));
        System.out.println(str6.matches(regex3));
        System.out.println("---------------------------------------------------------");
        String regex4 = " *java {0,}";//{0, }
        System.out.println(str1.matches(regex4));
        System.out.println(str2.matches(regex4));//true
        System.out.println(str3.matches(regex4));
        System.out.println(str4.matches(regex4));
        System.out.println(str5.matches(regex4));
        System.out.println(str6.matches(regex4));
        System.out.println("---------------------------------------------------------");
        String regex5  = " *(J|j)ava *";//либо J больш либо j маленькая   (ИЛИ)
        System.out.println(str1.matches(regex5));
        System.out.println(str2.matches(regex5));//true
        System.out.println(str3.matches(regex5));
        System.out.println(str4.matches(regex5));
        System.out.println(str5.matches(regex5));
        System.out.println(str6.matches(regex5));
        System.out.println("---------------------------------------------------------");
        String regex6  = " *[Jj]ava *";//один из символов множество J или с j
        System.out.println(str1.matches(regex6));//true
        System.out.println(str2.matches(regex6));//true
        System.out.println(str3.matches(regex6));//true
        System.out.println(str4.matches(regex6));//true
        System.out.println(str5.matches(regex6));
        System.out.println(str6.matches(regex6));
        System.out.println("---------------------------------------------------------");
        String regex7  = " *[Jj]a{1,2}va *";//
        System.out.println(str1.matches(regex7));//true
        System.out.println(str2.matches(regex7));//true
        System.out.println(str3.matches(regex7));//true
        System.out.println(str4.matches(regex7));//true
        System.out.println(str5.matches(regex7));//true
        System.out.println(str6.matches(regex7));
        System.out.println("---------------------------------------------------------");
        String regex8  = " *[Jj]a{1,2}va *";//
        System.out.println(str1.matches(regex7));//true
        System.out.println(str2.matches(regex7));//true
        System.out.println(str3.matches(regex7));//true
        System.out.println(str4.matches(regex7));//true
        System.out.println(str5.matches(regex7));//true
        System.out.println(str6.matches(regex7));
        System.out.println("---------------------------------------------------------");
        String regex9  = " *[Jj]a+va *";
        System.out.println(str1.matches(regex9));//true
        System.out.println(str2.matches(regex9));//true
        System.out.println(str3.matches(regex9));//true
        System.out.println(str4.matches(regex9));//true
        System.out.println(str5.matches(regex9));//true
        System.out.println(str6.matches(regex9));//true
        System.out.println("---------------------------------------------------------");



    }
}
