package model.owners;
//пример параметризированного класса
//T - параметр для типа поля класса
//при создании конкретного объекта класса нужно будет указать
// конкретный тип для поля, который заменит T

//GenOwner<T> - параметризация возможна любым типом
//GenOwner<T extends Pet> - параметризация возможна Pet и его подклассами
//GenOwner<T extends Pet & Cloneable> параметризация возможна Pet и его подклассами, которые
//имплементируют интерфейс Comparable

import model.subjects.Cleaner;
import model.subjects.Pet;

public class GenOwner<T> {
    private String name;
    private T subject;

    public GenOwner() {
    }

    public GenOwner(String name, T subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getSubject() {
        return subject;
    }

    public void setSubject(T subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "GenOwner{" +
                "name='" + name + '\'' +
                ", subject=" + subject +
                '}';
    }
}
