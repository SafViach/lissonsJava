package lesson010._03_inner.model;

public class Dog {
    private String name;
    private DogTail tail;//поле типа внутреннего класса

    public Dog(String name, int length) {
        this.name = name;
        this.tail = new DogTail(length);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //в методах внешнего класса доступ к полям и методавм внутреннего
    // осуществляется через конкретный созданный объект
    public void wagTail(){
        tail.wag();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", tail=" + tail +
                '}';
    }

    //закрытый внутренний класс
    private class DogTail{
       private int length;

        public DogTail(int length) {
            this.length = length;
        }

        //во внутреннем классе есть доступ к полям внешнего
        //объект внутреннего класса всегда имеет связь с объектом внешнего
        public void wag(){
            System.out.println(name + " wags the tail with length " + length);
        }

        @Override
        public String toString() {
            return "DogTail{" +
                    "length=" + length +
                    '}';
        }
    }

}
