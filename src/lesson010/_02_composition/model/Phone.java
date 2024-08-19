package lesson010._02_composition.model;

public class Phone {
    private String model;
    private Battery battery;

    public Phone() {
        model = "";
        battery = new Battery();
    }

    public Phone(String model, int capacity) {
        this.model = model;
        battery = new Battery(capacity);
    }

    //get+model
    public String getModel() {
        return model;
    }

    //set+model
    public void setModel(String model) {
        this.model = model;
    }

    //геттер который возвращает не батарею, а емкость батареи
    public int getBatteryCapacity() {
        return battery.getCapacity();//делегирование
    }


    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", battery=" + battery +
                '}';
    }
}
