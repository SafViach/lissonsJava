package lesson017.lesson14.task2.model.pets;

import lesson017.lesson14.task2.model.interfaces.IPlay;
import lesson017.lesson14.task2.model.interfaces.ISwim;

public class Norway extends Cat implements ISwim, IPlay {

    public Norway() {
    }

    public Norway(String name, Color color) {
        super(name, color);
    }

    @Override
    public void play() {
        System.out.println("Норвежский котик " + getName() + " играет");
    }

    @Override
    public void swim() {
        System.out.println("Норвежский котик " + getName() + " плавает");
    }

    @Override
    public void voice() {
        System.out.println("Норвежский котик " + getName() + " мяукает");
    }

    @Override
    public void wag() {
        System.out.println("Норвежский котик " + getName() + " виляет");
    }

    @Override
    public String toString() {
        return "Norway{" +
                "name='" + getName() + '\'' +
                ", color=" + getColor() +
                '}';
    }
}
