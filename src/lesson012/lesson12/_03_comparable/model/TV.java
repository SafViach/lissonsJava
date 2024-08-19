package lesson012.lesson12._03_comparable.model;

//класс реализует интерфейс Comparable и обязан переобределить его абстрактный метод
//compareTo
public class TV implements Comparable<TV> {
    private int price;

    public TV(int price) {
        this.price = price;
    }

    //цель метода сравнить this с tv
    //если оказалось что this больше tv, то вернуть нужно любое положительное число
    //если оказалось что this меньше tv, то вернуть нужно любое отрицательное число
    //если оказалось что this равен tv, то вернуть нужно 0
    @Override
    public int compareTo(TV tv) {
//        if (price > tv.price)
//            return 1;
//        if (price < tv.price)
//            return -1;
//        return 0;

//        return price > tv.price ? 1 : (price < tv.price ? -1 : 0);

        return price - tv.price;
    }

    @Override
    public String toString() {
        return "TV{" +
                "price=" + price +
                '}';
    }
}
