package lesson031.model;

public class Car {
    private String model;
    private Color color;

    public Car() {
    }

    public Car(String model, Color color) {
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("model='").append(model).append('\'');
        sb.append(", color=").append(color);
        sb.append('}');
        return sb.toString();
    }
}
