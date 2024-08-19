package lesson002;

public class Main2 {
    public static void main(String[] args) {
        //операторы
        //ветвление if  switch  ?:
        //циклы for  while   do while   foreach

        //если зарплата меньше чем 500, увеличить в два раза
        double salary1 = 450;
        if (salary1 < 500) {
            salary1 *= 2;//salary1 = salary1 * 2;
        }
        System.out.println(salary1);
        //если зарплата меньше чем 500, увеличить в два раза, иначе то увеличить на 200
        double salary2 = 750;
        if (salary2 < 500) {
            salary2 *= 2;
        } else {
            salary2 += 200;
        }
        System.out.println(salary2);
        //если зарплата меньше чем 500, увеличить в два раза; если от 500 до 1000, то увеличить на 200
        //иначе отнять 300
        double salary3 = 1400;
        //&& и      || или
        if (salary3 < 500) {
            salary3 *= 2;
        } else {
            if (salary3 >= 500 && salary3 < 1000) {
                salary3 += 200;
            } else {
                salary3 -= 300;
            }
        }
        System.out.println(salary3);

        double salary4 = 1400;
        //&& и      || или
        if (salary4 < 500)
            salary4 *= 2;
        else if (salary4 >= 500 && salary4 < 1000)
            salary4 += 200;
        else
            salary4 -= 300;

        System.out.println(salary4);

    }
}
