package lesson011.task4.model;

public class Earrings extends Jewellery{
    private static double coef = 1.5;

    public Earrings() {
    }

    public Earrings(int article, Producer producer, double weight, Material material) {
        super(article, producer, weight, material);
    }

    @Override
    public double getDifFactor() {
        return coef;
    }

    @Override
    public String toString() {
        return "Earrings{" +
                super.toString()+
                '}';
    }
}
