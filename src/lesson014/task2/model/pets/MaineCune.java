package lesson014.task2.model.pets;

import lesson014.task2.model.interfaces.IPlay;
import lesson014.task2.model.interfaces.ISwim;

public class MaineCune extends Cat implements ISwim, IPlay {
    public MaineCune() {
    }

    public MaineCune(String name, Color color) {
        super(name, color);
    }

    @Override
    public void play() {
        System.out.println("Мейн кун котик " + getName() + " играет");
    }

    @Override
    public void swim() {
        System.out.println("Мейн кун котик " + getName() + " плавает");
    }

    @Override
    public void voice() {
        System.out.println("Мейн кун котик " + getName() + " мяукает");
    }

    @Override
    public void wag() {
        System.out.println("Мейн кун котик " + getName() + " виляет");
    }

    @Override
    public String toString() {
        return "MaineCune{" +
                "name='" + getName() + '\'' +
                ", color=" + getColor() +
                '}';
    }
}
