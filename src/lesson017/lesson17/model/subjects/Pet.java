package model.subjects;

public abstract class Pet {
    private String nickname;

    public Pet() {
    }

    public Pet(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "nickname='" + nickname + '\'' +
                '}';
    }
}
