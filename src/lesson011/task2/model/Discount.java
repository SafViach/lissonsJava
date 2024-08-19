package lesson011.task2.model;

public enum Discount {
    UNDISCOUNTED(1),//public static final Discount UNDISCOUNTED = new Discount("UNDISCOUNTED", 0, 1);
    DISCOUNTED(0.9),
    REDDISCOUNTED(0.75);

    private double discount;//дополнительное поле для каждого элемента перечисления

    Discount(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return name() + " " + discount;
    }
}
