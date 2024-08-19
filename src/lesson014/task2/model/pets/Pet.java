package lesson014.task2.model.pets;

public abstract class Pet {
    private String name;
    private Color color;

    public Pet() {
    }

    public Pet(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void eat();//все животные умеют кушать

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", color=" + color +
                '}';
    }
}
