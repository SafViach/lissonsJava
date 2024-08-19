package lesson027;

public class Cat {
    private String nickname;
    private double weight;

    public Cat(String nickname, double weight) {
        this.nickname = nickname;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "nickname='" + nickname + '\'' +
                ", weight=" + weight +
                '}';
    }
}
