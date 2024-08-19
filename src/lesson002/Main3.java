package lesson002;

public class Main3 {
    public static void main(String[] args) {
        //тернарный оператор условие ? выражение1 : выражение2

        //если зарплата меньше чем 500, увеличить в два раза
        double salary1 = 450;
        salary1 = salary1 < 500 ? salary1 * 2 : salary1;
        System.out.println(salary1);

        //если зарплата меньше чем 500, увеличить в два раза, иначе то увеличить на 200
        double salary2 = 750;
        salary2 = salary2 < 500 ? salary2 * 2 : salary2 + 200;
        System.out.println(salary2);

        //если зарплата меньше чем 500, увеличить в два раза; если от 500 до 1000, то увеличить на 200
        //иначе отнять 300
        double salary3 = 1400;
        salary3 = salary3 < 500 ? salary3 * 2 : (salary3 >= 500 && salary3 < 1000 ? salary3 + 200 : salary3 - 300);
        System.out.println(salary3);
    }
}
