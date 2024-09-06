package lesson032.model;

public class Cat {
    private String nickname;
    private Color color;
    private double weight;

    public Cat() {
    }

    public Cat(String nickname, Color color, double weight) {
        this.nickname = nickname;
        this.color = color;
        this.weight = weight;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cat{");
        sb.append("nickname='").append(nickname).append('\'');
        sb.append(", color=").append(color);
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }
}
