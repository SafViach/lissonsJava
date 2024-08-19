package task4.model;

public class Ring extends Jewellery{
    private double size;
    private static double coef = 1.2;

    public Ring() {
    }

    //this  должен быть таким же как и ring
    public Ring(Ring ring){
        //super(ring.getArticle(), ring.getProducer(), ring.getWeight(), ring.getMaterial());
        super(ring);
        size = ring.size;
    }

    public Ring(int article, Producer producer, double weight, Material material, double size) {
        super(article, producer, weight, material);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public double getDifFactor() {
        return coef;
    }

    @Override
    public String toString() {
        return "Ring{" +
                super.toString() +
                ", size=" + size +
                '}';
    }
}
