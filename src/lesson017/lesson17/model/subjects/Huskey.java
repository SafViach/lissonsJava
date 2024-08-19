package model.subjects;

public class Huskey extends Dog {
    public Huskey() {
    }

    public Huskey(String nickname) {
        super(nickname);
    }

    public void destroy() {
        System.out.println(getNickname() + " is destroying");
    }

    @Override
    public String toString() {
        return "Huskey{" +
                "nickname='" + getNickname() + '\'' +
                '}';
    }
}
