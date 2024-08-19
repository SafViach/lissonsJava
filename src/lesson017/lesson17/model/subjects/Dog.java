package model.subjects;

public class Dog extends Pet {
    public Dog() {
    }

    public Dog(String nickname) {
        super(nickname);
    }

    public void guard() {
        System.out.println(getNickname() + " is guarding");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nickname='" + getNickname() + '\'' +
                '}';
    }
}
