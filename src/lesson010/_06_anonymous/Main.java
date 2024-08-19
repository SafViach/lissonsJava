package lesson010._06_anonymous;

import lesson010._06_anonymous.model.Animal;
import lesson010._06_anonymous.model.Worker;

import java.util.TreeMap;


//анонимные классы позволяют при созданни объекта переопределить некоторые методы класса
//не создавая при этом новый класс а делая это налету
//анонимный класс не имеет имени
public class Main {

    public static void main(String[] args) {
        Worker[] workers = {
                new Worker("Misha", 1000),
                new Worker("Igor", 1000) {
                    @Override
                    public double generalSalary() {
                        return getSalary() * 3;
                    }
                },
                new Worker("Ira", 1000)
        };

        for (Worker worker : workers) {
            System.out.println(worker);
        }

        //объект абстрактного класса сохдать нельзя
        //Animal animal1 = new Animal();
        //animal1.eat();

        //анонимные классы позволяют создать объект абстрактного класса, налету переопределив
        //все его абстрактные методы
        Animal animal2 = new Animal(){
            @Override
            public void eat() {
                System.out.println("Птичка клюет");
            }
        };

        animal2.eat();
    }
}
