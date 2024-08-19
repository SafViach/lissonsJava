package lesson011._01_enum;


import java.net.ServerSocket;

//Перечисления необходимы для объединия логически связанных между собой слов
//Enum - базовый класс для создания перечислений
public class Main {
    public static void main(String[] args) {
        System.out.println(Season.SUMMER);//toString()
        System.out.println(Season.FALL.toString());
        System.out.println(Season.FALL.ordinal());

        //Season.WINTER = null; все ссылки перечисления final

        //Season season = new Season(); нельзя создавать объекты класса перечисления

        Season season1 = null;
        Season season2 = Season.SPRING;

        System.out.println(season2 == Season.SPRING);
        season1 = Season.WINTER;

        System.out.println(season1 == season2);



        //Season.valueOf() принимает строку, смотрит, есть ли перечисление, соотвествующее
        //указанной строке и возвращает ссылку на объект перечисленния если есть

        String str1 = "WINTER";
        //как из строки получить элемент перечисления
        Season season3 = Season.valueOf(str1);
        System.out.println(season3);

        String str2 = "Winter";
        Season season4 = Season.valueOf(str2.toUpperCase());//к верхнему регистру
        System.out.println(season4);



        String str3 = "Winter";
        str3 = str3.toUpperCase();
        Season season5 =  switch (str3){
            case "WINTER", "SPRING", "SUMMER","FALL" -> Season.valueOf(str3);
            default -> null;
        };
        System.out.println(season5);


        Season season6 = Season.SPRING;

        switch (season6){
            case WINTER:
                System.out.println("Холодно");
                break;
            case SPRING:
                System.out.println("Тепло");
                break;
            case SUMMER:
                System.out.println("Жарко");
                break;
            case FALL:
                System.out.println("Сыро");
                break;
        }

        //Season.values() вернет все элементы перечисления в виде массива
        System.out.println("----------------------------------");
        Season[] seasons = Season.values();
        for (Season season : seasons) {
            System.out.println(season);
        }
        System.out.println("-----------------------");
        for (Season season : Season.values()) {
            System.out.println(season);
        }
        System.out.println("----------------------");
        System.out.println(seasons[0]);//WINTER
        System.out.println(Season.values()[1]);//SPRING
    }
}
