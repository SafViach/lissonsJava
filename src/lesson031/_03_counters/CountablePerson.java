package lesson031._03_counters;

import lesson031.model.Person;

@FunctionalInterface
public interface CountablePerson {
    //абстрактный метод функционального интерфейса
    boolean checkByField(Person person);
}
