package model.subjects;

public class Cleaner {
    private String model;

    public Cleaner() {
    }

    public Cleaner(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void vacuum(){
        System.out.println(model + " is vacuuming");
    }

    @Override
    public String toString() {
        return "Cleaner{" +
                "model='" + model + '\'' +
                '}';
    }
}
