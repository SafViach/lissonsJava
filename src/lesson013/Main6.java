package lesson013;

import lesson013.model.Car;
import lesson013.model.Producer;

//чтобы получать копиии объектов при помощит clone нужно
//1) в классе переобределить метод clone(), при переопределении указать public
//2) при вызове метода clone необходимо пробросить исключение throws CloneNotSupportedException
//3) так как метод clone возвращает тип Object необходимо указать явное преобразование к нужному классу
//4) класс должен реализовывать(имплиментировать) интерфейс Cloneable
public class Main6 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Producer producer1 = new Producer("China", 1950);

        //при создании копии при помощи клон происходит копирование объектов на низком уровне
        //не средсвами джава без работы блоков кода и конструкторов
        Producer producer2 = (Producer) producer1.clone();//точная копия объекта
        System.out.println(producer2);
        System.out.println(producer2 == producer1);

        Producer producer3 = new Producer(producer1);//точная копия объекта
        System.out.println(producer3);
        System.out.println(producer3 == producer1);
    }
}
