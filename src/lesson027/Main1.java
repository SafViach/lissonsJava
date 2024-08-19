package lesson027;
public class Main1 {
    public static void main(String[] args) {
        //Регулярные выражения - средства позволяющие проверить соотвествует ли некоторая строка
        // или подстрока определенному шаблону
        //регулярки обладают своим собственным синтаксисом построения шаблона для проверки,
        //не привязываются к конкретному языку программирования

        //Работа с регулярками в Java
        //1) методы String - matches и split
        //2) классы Patter и Matcher

        //по сути регулярка это объек класса String записанный по определенному синтаксису

        //лементы синитаксиса регулярок
        //1 кванторы, квантификаторы - определят сколько раз может встречаться
        //символ слева от квантора
        //{1,5} от 1 до 5 раз
        //{1,} от 1 до беск
        //{,5} до 5 раз
        // ? - либо встречается один раз либо вообще не встречается
        // + встречается от 1 до бесконечности раз
        // * встречается от 0 до беск раз {0,}
        //{8} - обязательно 8 сивомволов

        //множества [...] один из перечисленных внутри символов

        String str1 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;

        str1 = "java";
        str2 = "       java";
        str3 = "java ";
        str4 = "Java";
        str5 = "jaava";
        str6 = "     jaaaaava     ";

        //регулярное выражение может быть просто совокупность символов
        String regex1 = "java";//совпало с 1
        System.out.println(str1.matches(regex1));
        System.out.println(str2.matches(regex1));
        System.out.println(str3.matches(regex1));
        System.out.println(str4.matches(regex1));
        System.out.println(str5.matches(regex1));
        System.out.println(str6.matches(regex1));

        System.out.println("----------------------");
        String regex2 = " java ";// ни с одним
        System.out.println(str1.matches(regex2));
        System.out.println(str2.matches(regex2));
        System.out.println(str3.matches(regex2));
        System.out.println(str4.matches(regex2));
        System.out.println(str5.matches(regex2));
        System.out.println(str6.matches(regex2));

        System.out.println("-------------------");
        String regex3 = " *java";//перед словом может быть сколько угодно
        // пробелов а может и не быть вовсе
        System.out.println(str1.matches(regex3));
        System.out.println(str2.matches(regex3));
        System.out.println(str3.matches(regex3));
        System.out.println(str4.matches(regex3));
        System.out.println(str5.matches(regex3));
        System.out.println(str6.matches(regex3));

        System.out.println("-------------------");
        String regex4 = " *java {0,}";
        System.out.println(str1.matches(regex4));
        System.out.println(str2.matches(regex4));
        System.out.println(str3.matches(regex4));
        System.out.println(str4.matches(regex4));
        System.out.println(str5.matches(regex4));
        System.out.println(str6.matches(regex4));

        System.out.println("-------------------");
        String regex5 = " *(J|j)ava *";//либо J либо j   ИЛИ
        System.out.println(str1.matches(regex5));
        System.out.println(str2.matches(regex5));
        System.out.println(str3.matches(regex5));
        System.out.println(str4.matches(regex5));
        System.out.println(str5.matches(regex5));
        System.out.println(str6.matches(regex5));

        System.out.println("-------------------");
        String regex6 = " *[Jj]ava *";//один из символов множества J или c j
        System.out.println(str1.matches(regex6));
        System.out.println(str2.matches(regex6));
        System.out.println(str3.matches(regex6));
        System.out.println(str4.matches(regex6));
        System.out.println(str5.matches(regex6));
        System.out.println(str6.matches(regex6));

        System.out.println("-------------------");
        String regex7 = " *[Jj]a{1,2}va *";//а внутри встречается от 1 до 2 раз
        System.out.println(str1.matches(regex7));
        System.out.println(str2.matches(regex7));
        System.out.println(str3.matches(regex7));
        System.out.println(str4.matches(regex7));
        System.out.println(str5.matches(regex7));
        System.out.println(str6.matches(regex7));

        System.out.println("-------------------");
        String regex8 = " *[Jj]a+va *";
        System.out.println(str1.matches(regex8));
        System.out.println(str2.matches(regex8));
        System.out.println(str3.matches(regex8));
        System.out.println(str4.matches(regex8));
        System.out.println(str5.matches(regex8));
        System.out.println(str6.matches(regex8));
    }
}
