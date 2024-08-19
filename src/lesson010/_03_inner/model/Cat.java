package lesson010._03_inner.model;

public class Cat {
    private String name;
    private Cat.CatTail tail;//поле типа внутреннего класса

    public Cat(String name, int length) {
        this.name = name;
        this.tail = new Cat.CatTail(length);
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
        return "Cat{" +
                "name='" + name + '\'' +
                ", tail=" + tail +
                '}';
    }

    //отрытый внутренний класс
    public class CatTail{
        private int length;

        public CatTail(int length) {
            this.length = length;
        }

        //во внутреннем классе есть доступ к полям внешнего
        //объект внутреннего класса всегда имеет связь с объектом внешнего
        public void wag(){
            //Cat.this.name
            System.out.println(name + " wags the tail with length " + length);
        }

        @Override
        public String toString() {
            return "CatTail{" +
                    "length=" + length +
                    '}';
        }
    }
}
