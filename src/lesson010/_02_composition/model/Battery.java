package lesson010._02_composition.model;

public class Battery {
    private int capacity;

    public Battery() {
        capacity = 4000;
    }

    public Battery(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Battery{" +
                "capacity=" + capacity +
                '}';
    }
}
