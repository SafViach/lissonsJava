package model.owners;

import model.subjects.Cleaner;

public class CleanerOwner extends Owner{
    private Cleaner subject;

    public CleanerOwner() {
    }

    public CleanerOwner(String name, Cleaner subject) {
        super(name);
        this.subject = subject;
    }

    public Cleaner getSubject() {
        return subject;
    }

    public void setSubject(Cleaner subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "CleanerOwner{" +
                "name='" + getName() + '\'' +
                ", subject=" + subject +
                '}';
    }
}
