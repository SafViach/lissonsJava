package lesson001;

public class Main3 {
    public static void main(String[] args) {
        byte db1 = 7;
        System.out.println(db1);
        short ds1 = 30_000;
        System.out.println("short: " + ds1);
        int di1 = 2_000_000_000;
        System.out.println("int: " + di1);
        long dl1 = 3000000000l;//l в конце объяснит компилятору что число нужно воспринимать
        //не как int а как long
        ds1 = db1;//записываем значение из byte в short
        db1 = (byte) ds1;//здесь ошибка, чтобы от нее избавиться необходимое явное преобразование
        //но возможна потеря данных
        //из переменных типов данных меньших объемов можно записывать данные в переменных больших

        double doubleVal1 = 7.8;
        System.out.println("double1: " + doubleVal1);
        double doubleVal2 = (double)1/3.;//для получения вещественного результата при делении
        //хотя бы один из участников должен быть вещественным
        System.out.println("double2: " +doubleVal2);
    }
}
