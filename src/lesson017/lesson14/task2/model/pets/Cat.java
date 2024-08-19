package lesson017.lesson14.task2.model.pets;

import lesson017.lesson14.task2.model.interfaces.IVoice;

//описав класс как абстрактный мы не обязаны в нем переопределять
//абстрактные eat и voice
//однако в этой задаче считаем что все коты едят одинаково но по разному
//мяукают
public abstract class Cat extends Pet implements IVoice {

    public Cat() {
    }

    public Cat(String name, Color color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("Котик " + getName() + " кушает");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + '\'' +
                ", color=" + getColor() +
                '}';
    }
}
