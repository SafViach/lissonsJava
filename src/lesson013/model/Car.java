package lesson013.model;

public class Car implements Comparable<Car>, Cloneable {
    private String model;
    private double price;
    private Producer producer;

    //конструктор копирование(поверхностное копирование)
//    public Car(Car car){
//        this(car.model, car.price, car.producer);
//    }

    //конструктор копирование(глубокое копирование)
    public Car(Car car){
        this(car.model, car.price, new Producer(car.producer));//создаем отдельный объект производите
        //для этого авто
    }

    public Car() {
    }

    public Car(String model, double price, Producer producer) {
        this.model = model;
        this.price = price;
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    @Override
    public int compareTo(Car car) {
        int cmp = model.compareTo(car.model);//compareTo - String
        if (cmp != 0)
            return cmp;
        cmp = Double.compare(price, car.price);
        if (cmp != 0)
            return cmp;
        return producer.compareTo(car.producer);//compareTo - Producer
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        //return super.clone();//по умолчанию поверхностное клонирование
        Car cloneCar = (Car) super.clone();//выполнили поверхностное и записали в одельную ссылку
        Producer producerClone = (Producer) this.producer.clone();//отдельно клонируем производителя
        cloneCar.producer = producerClone;//вставляем в объект вповерхного копироания объек производителя
        return cloneCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", producer=" + producer +
                '}';
    }
}
