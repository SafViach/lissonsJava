package lesson031._03_counters;

import lesson031.model.Person;

@FunctionalInterface
//функциональный интерфейс, метод которого примает любой объект
//что у него проверяет и возвращает true или false
public interface Countable<T> {
    boolean checkByField( T object);
}
