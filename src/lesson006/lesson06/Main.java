package lesson006.lesson06;

import lesson006.lesson06.model.User;

public class Main {
    public static void main(String[] args) {

        //класс будет прогружен в память при создании объекта или
        //использовании static поля
        User user = null;
        User user1 = new User("Igor");
        User user2 = new User("Misha");
        User user3 = new User("Grisha");
        user1.info();
        user2.info();
        user3.info();
    }
}
