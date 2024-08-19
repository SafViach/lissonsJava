package dzTask006.model;

public class ProductPurchase {
    private Product product;
    private int kol;

    public ProductPurchase(Product product, int kol) {
        this.product = product;
        this.kol = kol;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getKol() {
        return kol;
    }

    public void setKol(int kol) {
        this.kol = kol;
    }
    public double calcSumm(){
        return product.getPrice()*kol;
    }
    public String toFileLine(){
        return product.getClass().getSimpleName() + " "+ product.getName()+" "+product.getPrice()+" "+kol;
    }
    @Override
    public String toString() {
        return "ProductPurchase{" +
                "product=" + product +
                ", kol=" + kol +
                '}';
    }
}
