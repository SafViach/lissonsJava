package model.owners;

import model.subjects.Dog;

public class DogOwner extends Owner{
    private Dog subject;

    public DogOwner() {
    }

    public DogOwner(String name, Dog subject) {
        super(name);
        this.subject = subject;
    }

    public Dog getSubject() {
        return subject;
    }

    public void setSubject(Dog subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "DogOwner{" +

                "name='" + getName() + '\'' +
                ", subject=" + subject +
                '}';
    }
}
