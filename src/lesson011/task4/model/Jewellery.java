package lesson011.task4.model;

public abstract class Jewellery {
    private int article;
    private Producer producer;
    private double weight;
    private Material material;

    public Jewellery() {
    }

    public Jewellery(int article, Producer producer, double weight, Material material) {
        this.article = article;
        this.producer = producer;
        this.weight = weight;
        this.material = material;
    }

    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public abstract double getDifFactor();

    public double calcPrice() {
        return weight * material.getPricePerGram() * getDifFactor();
    }

    @Override
    public String toString() {
        return article + " " + producer + " " + weight + " " + material + " " + calcPrice();
    }
}
