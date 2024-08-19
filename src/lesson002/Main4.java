package lesson002;

public class Main4 {
    public static void main(String[] args) {
        //switch оператор множественного выбора
        //применять когда одну и туже переменную нужно сравнить на равенство с кучей заранее известных
        // константных значений
        //работает со целыми числами, символами, строками и перечислениями

        //1 - Зима, 2 - Весна, 3 - Лето, 4 - Осень
        int num1 = 2;
//        if (num1 == 1) {
//            System.out.println("Winter");
//        } else if (num1 == 2) {
//            System.out.println("Spring");
//        } else if (num1 == 3) {
//            System.out.println("Summer");
//        } else if (num1 == 4) {
//            System.out.println("Fall");
//        } else {
//            System.out.println("incorrect number");
//        }

        switch (num1){
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Spring");
                break;
            case 3:
                System.out.println("Summer");
                break;
            case 4:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Incorrect number");
                break;
        }

        String str2 = "Winter";
        int num2 = 0;

        switch (str2){
            case "Winter":
                num2 = 1;
                break;
            case "Spring":
                num2 = 2;
                break;
            case "Summer":
                num2 = 3;
                break;
            case "Fall":
                num2 = 4;
                break;
            default:
                num2 = 0;
                break;
        }
        System.out.println("number of season: " + num2);

        //в Java switch может возвращать значение
        str2 = "Winter";
        num2 = switch (str2){
            case "Winter" -> {
                System.out.println("Зима");//если помимо возвращаемого значения нужны еще команды то берем в {}
                yield 1;// yield вернет значение из switch
            }
            case "Spring" -> 2;
            case "Summer" -> 3;
            case "Fall" -> 4;
            default -> {
                System.out.println("Неверный номер поры года");
                yield 0;
            }
        };
        System.out.println("number of season: " + num2);
    }
}
