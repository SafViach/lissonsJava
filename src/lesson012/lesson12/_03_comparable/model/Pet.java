package lesson012.lesson12._03_comparable.model;

public class Pet implements Comparable<Pet> {
    private double weight;

    public Pet(double weight) {
        this.weight = weight;
    }

    //для сравнения double рекомендуется воспользоваться методов класса обертки
    @Override
    public int compareTo(Pet pet) {
        return Double.compare(weight, pet.weight);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "weight=" + weight +
                '}';
    }
}
