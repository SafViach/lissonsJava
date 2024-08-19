package dzTask006.model;

public class Product25 extends Product{

    static int discond = 25;

    @Override
    public double calcPriceDiscond() {
        return getPrice()-(getPrice()*discond)/100;
    }

    @Override
    public String toFileLine() {
        return super.toFileLine();
    }

    public Product25(String name, double price) {
        super(name, price);
    }

}
