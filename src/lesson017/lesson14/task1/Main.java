package lesson017.lesson14.task1;

import lesson017.lesson14.task1.model.*;

public class Main {
    public static void main(String[] args) {
        Flute flute1 = new Flute();
        flute1.sound();

        //нельзя создавать объекты на основе интерфейса
        //Instrument instrument = new Instrument();

        //В ссылках типа интерфейса можно хранить объекты классов
        //реализующих этот интерфейс
        Instrument instrument = new Guitar();
        //однако через такие ссылки будут доступны только методы
        // это интерфейса

        Instrument[] instruments = {
                new Guitar(),
                new Flute(),
                new Piano(),
                new Drum(),
                new Violin()
        };

        System.out.println("-------------------");
        for (Instrument instr : instruments) {
            instr.sound();
        }

    }
}
