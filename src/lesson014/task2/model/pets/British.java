package lesson014.task2.model.pets;

import lesson014.task2.model.interfaces.IPlay;

public class British extends Cat implements IPlay {

    public British() {
    }

    public British(String name, Color color) {
        super(name, color);
    }

    @Override
    public void play() {
        System.out.println("Британский котик " + getName() + " играет");
    }

    @Override
    public void voice() {
        System.out.println("Британский котик " + getName() + " мяукает");
    }

    @Override
    public void wag() {
        System.out.println("Британский котик " + getName() + " виляет");
    }

    @Override
    public String toString() {
        return "British{" +
                "name='" + getName() + '\'' +
                ", color=" + getColor() +
                '}';
    }
}
