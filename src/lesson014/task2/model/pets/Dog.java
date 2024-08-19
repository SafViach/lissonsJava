package lesson014.task2.model.pets;

import lesson014.task2.model.interfaces.IPlay;
import lesson014.task2.model.interfaces.ISwim;
import lesson014.task2.model.interfaces.IVoice;

public class Dog extends Pet implements IPlay, ISwim, IVoice {

    public Dog() {
    }

    public Dog(String name, Color color) {
        super(name, color);
    }

    @Override
    public void play() {
        System.out.println("Собака " + getName() + " играет");
    }

    @Override
    public void swim() {
        System.out.println("Собака " + getName() + " плавает");
    }

    @Override
    public void voice() {
        System.out.println("Собака " + getName() + " лает");
    }

    @Override
    public void wag() {
        System.out.println("Собака " + getName() + " виляет");
    }

    @Override
    public void eat() {
        System.out.println("Собака " + getName() + " кушает");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + getName() + '\'' +
                ", color=" + getColor() +
                '}';
    }
}
