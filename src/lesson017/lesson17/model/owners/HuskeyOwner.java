package model.owners;

import model.subjects.Huskey;

public class HuskeyOwner extends Owner{
    private Huskey subject;

    public HuskeyOwner() {
    }

    public HuskeyOwner(String name, Huskey subject) {
        super(name);
        this.subject = subject;
    }

    public Huskey getSubject() {
        return subject;
    }

    public void setSubject(Huskey subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "HuskeyOwner{" +
                "name='" + getName() + '\'' +
                ", subject=" + subject +
                '}';
    }
}
