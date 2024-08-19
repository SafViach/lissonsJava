package lesson010._02_composition;

import lesson010._02_composition.model.Battery;
import lesson010._02_composition.model.Phone;

public class Main {
    public static void main(String[] args) {

        //композиция - жесткая взаимосвязь объектов
        //при уничтожении объекта телефон, будет уичтожен и объект батарея
        Phone phone1 = new Phone("Smasung", 5000);

        System.out.println(phone1.getBatteryCapacity());

        Phone phone2 = new Phone("Xiaomi", 4500);
        System.out.println(phone1);
        System.out.println(phone2);

        Battery battery1 = new Battery(3000);

        phone1 = null;
        phone2 = null;

    }
}
