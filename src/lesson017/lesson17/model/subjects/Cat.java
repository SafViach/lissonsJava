package model.subjects;

public class Cat extends Pet{
    public Cat() {
    }

    public Cat(String nickname) {
        super(nickname);
    }

    public void sleep(){
        System.out.println(getNickname() + " is sleeping");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "nickname='" + getNickname() + '\'' +
                '}';
    }
}
