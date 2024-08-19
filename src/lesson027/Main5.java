package lesson027;
public class Main5 {
    public static void main(String[] args) {

        String str1 = "Ivamov Ivan Ivanovich";
        String str2 = "IvamovIvanIvanovich";
        String str3 = "    Ivamov   Ivan   Ivanovich    ";
        String str4 = "Iv3amov Ivan2 Ivanovich";
        String str5 = "ivamov Ivan Ivanovich";
        String str6 = "Ivamov Ivan_ Ivanovich";

        String reg1 = "\\s*[A-Z][a-z]+\\s+[A-Z][a-z]+\\s+[A-Z][a-z]+\\s*";
        System.out.println(str1.matches(reg1));
        System.out.println(str2.matches(reg1));
        System.out.println(str3.matches(reg1));
        System.out.println(str4.matches(reg1));
        System.out.println(str5.matches(reg1));
        System.out.println(str6.matches(reg1));

        System.out.println("------------------");
        String reg2 = "\\s*([A-Z][a-z]+\\s*){3}";
        System.out.println(str1.matches(reg2));
        System.out.println(str2.matches(reg2));
        System.out.println(str3.matches(reg2));
        System.out.println(str4.matches(reg2));
        System.out.println(str5.matches(reg2));
        System.out.println(str6.matches(reg2));

        System.out.println("------------------");
        String reg3 = "\\s*(\\p{Upper}\\p{Lower}+\\s*){3}";
        System.out.println(str1.matches(reg3));
        System.out.println(str2.matches(reg3));
        System.out.println(str3.matches(reg3));
        System.out.println(str4.matches(reg3));
        System.out.println(str5.matches(reg3));
        System.out.println(str6.matches(reg3));

    }
}
