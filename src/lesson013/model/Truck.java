package lesson013.model;

public class Truck extends Car {
    private int capacity;//объем

    public Truck() {
    }

    public Truck(String model, double price, Producer producer, int capacity) {
        super(model, price, producer);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public int compareTo(Car car) {
        int cmp = super.compareTo(car);
        if (cmp != 0)
            return cmp;
        return capacity - ((Truck) car).capacity;

    }

    @Override
    public String toString() {
        return "Truck{" +
                "model='" + getModel() + '\'' +
                ", price=" + getPrice() +
                ", producer=" + getProducer() +
                ", capacity=" + capacity +
                '}';
    }
}
