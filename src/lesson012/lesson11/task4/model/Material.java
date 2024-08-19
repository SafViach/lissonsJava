package task4.model;

public enum Material {
    GOLD("Золото", 119.77),
    SILVER("Серебро", 2.25),
    PLATINUM("Платина", 89.48);

    private String rusTitle;
    private double pricePerGram;

    public void setPricePerGram(double pricePerGram) {
        this.pricePerGram = pricePerGram;
    }

    public String getRusTitle() {
        return rusTitle;
    }

    public double getPricePerGram() {
        return pricePerGram;
    }

    Material(String rusTitle, double pricePerGram) {
        this.rusTitle = rusTitle;
        this.pricePerGram = pricePerGram;
    }

    @Override
    public String toString() {
        return rusTitle;
    }
}
