package lesson010._05_local.model;

public class Child {
    private String name;
    private int candy;

    public Child(String name, int candy) {
        this.name = name;
        this.candy = candy;
    }

    public void sleep() {

        //локальный класс имее доступ к полям внешнего
        class Sparrow {
            public void eatCandy() {
                while (candy > 0) {
                    candy--;
                    System.out.println("Chik - Chirik");
                }
            }
        }

        Sparrow sparrow = new Sparrow();
        sparrow.eatCandy();

    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", candy=" + candy +
                '}';
    }
}
