package lesson010._01_aggregation;

import lesson010._01_aggregation.model.Flat;
import lesson010._01_aggregation.model.Person;

public class Main {
    public static void main(String[] args) {

        //агрегация - взаимосвязь нежесткая
        //объект, которыя является часть другого может существовать отдельно от него
        Flat flat1 = new Flat("Sovetskaya 1");

        Person person1 = new Person("Igor", flat1);
        Person person2 = new Person("Ira", flat1);
        System.out.println(person1);
        System.out.println(person2);

        //меняем квартиру
        person2.setRegFlat(new Flat("Kirova 1"));

        //можем получить инфо о квартире
        Flat flat2 = person2.getRegFlat();//геттер вернет адрес объекта и запишем его в ссылку



        person2 = null;
        person1 = null;

        System.out.println(flat1);


    }
}
