package lesson011.task2;

import lesson011.task2.model.Discount;

public class Main {
    public static void main(String[] args) {
        for (Discount value : Discount.values()) {
            System.out.println(value);//toString
            System.out.println(value.getDiscount());
        }
        System.out.println("-------------------------");
        System.out.println(Discount.REDDISCOUNTED.getDiscount());

    }
}
