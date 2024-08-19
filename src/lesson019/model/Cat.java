package lesson019.model;

public class Cat implements Comparable<Cat> {
    private String nickname;
    private int age;

    public Cat(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Cat o) {
        return nickname.compareTo(o.nickname);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                '}';
    }
}
