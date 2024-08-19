package task4.model;

public class Necklace extends Jewellery {
    private static double coef = 1.4;

    public Necklace() {
    }

    public Necklace(int article, Producer producer, double weight, Material material) {
        super(article, producer, weight, material);
    }

    @Override
    public double getDifFactor() {
        return coef;
    }

    @Override
    public String toString() {
        return "Necklace{" +
                super.toString() +
                '}';
    }
}
