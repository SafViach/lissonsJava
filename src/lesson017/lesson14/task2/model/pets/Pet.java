package lesson017.lesson14.task2.model.pets;

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


    public static Color mostPopularColor(Pet[] pets){

        int[] counters = new int[Color.values().length];//создаем массив счетчиков под каждый
        //цвет

        for (Pet pet : pets) {
            counters[pet.getColor().ordinal()]++;//в соотвествии с ординалом цвета
            //увеличиваем счетчик элемента массива
        }

        int max = counters[0];
        int maxIndex = 0;

        for (int i = 1; i < counters.length; i++) {
            if (counters[i] > max) {
                max = counters[i];
                maxIndex = i;
            }
        }

        return Color.values()[maxIndex];
    }


    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", color=" + color +
                '}';
    }
}
