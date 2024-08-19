package dzTask006.model;

public class Product10 extends Product{

    static int discond = 25;

    public Product10(String name, double price) {
        super(name, price);
    }

    @Override
    public double calcPriceDiscond() {
        return getPrice()-(getPrice()*discond)/100;
    }

    @Override
    public String toFileLine() {
        return super.toFileLine();
    }

    @Override
    public String toString() {
        return "Product10{}";
    }
}
