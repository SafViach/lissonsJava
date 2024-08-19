package lesson013.model;

//производитель авто
public class Producer implements Comparable<Producer>, Cloneable{
    private String country;//страна
    private int year;//год основания

    //конструктор копирования, принимает объект, на основании его полей создает точно такой же
    public Producer(Producer producer){
        this(producer.country, producer.year);
    }

    public Producer(String country, int year) {
        this.country = country;
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //в первую очередь смотрим на страны, пр равных странах на года
    @Override
    public int compareTo(Producer producer) {
        int cmp = country.compareTo(producer.country);
        if(cmp != 0)
            return cmp;
        return year - producer.year;
    }

    //
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Producer{" +
                "country='" + country + '\'' +
                ", year=" + year +
                '}';
    }
}
