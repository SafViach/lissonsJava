package lesson014.task2.model.pets;

import lesson014.task2.model.interfaces.ISwim;

public class Fish extends Pet implements ISwim {

    public Fish() {
    }

    public Fish(String name, Color color) {
        super(name, color);
    }

    @Override
    public void swim() {
        System.out.println("Рыбка " + getName() + " плавает");
    }

    @Override
    public void eat() {
        System.out.println("Рыбка " + getName() + " кушает");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + getName() + '\'' +
                ", color=" + getColor() +
                '}';
    }
}
