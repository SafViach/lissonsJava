package model.owners;

import model.subjects.Cat;

//владелец кота
public class CatOwner extends Owner{
    private Cat subject;

    public CatOwner() {
    }

    public CatOwner(String name, Cat subject) {
        super(name);
        this.subject = subject;
    }

    public Cat getSubject() {
        return subject;
    }

    public void setSubject(Cat subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "CatOwner{" +
                "name='" + getName() + '\'' +
                ", subject=" + subject +
                '}';
    }
}
