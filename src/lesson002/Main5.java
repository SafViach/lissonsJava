package lesson002;

public class Main5 {
    public static void main(String[] args) {
        //for когда известно количество повторений
        //когда известно от, до, с каким шагом
        //перебрать все число от 1 до 50
        for (int i = 1; i <= 50; i++) {
            System.out.println(i);
        }

        for (int i = 50; i >= 0; i = i - 2) {
            System.out.println(i);
        }
        System.out.println("-------------------------------");
        //while    do while  когда количество итерация заранее неизвестно
        //while - c предусловием (сначала идет проверка,т.е.
        // тело цикла может ни разу не выполнится)
        //do while - с постусловием(сначало выполняется тело цикла в любом случае
        //потом проверка, нужно ли выполнять еще раз)

//        while (условие){
//            тело
//        }

//        do {
//            тело
//        }while (условие);

    }
}