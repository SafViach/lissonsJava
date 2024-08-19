package tasks28dz.tast04;

import tasks28dz.tast04.model.Worker;

import java.io.File;
import java.time.LocalDate;

public class Main {
    //4. Дан файл, содержащий информацию о людях (имя, дата рождения, зарплата) разделенную «;».
    //Принимаем что примером актуальной даты считается формат 01.01.2024.
    //4.1 Считать из файла данные о людях и создать коллекцию объектов.
    //4.2 Для создания объекта использовать метод, который принимает строку файла, проверяет ее на
    //соответствие при помощи регулярного выражения. В случае корректности метод возвращает
    //объект или генерирует исключение InvalidTXTLine и пробрасывает его в место вызова.
    //4.3 InvalidTXTLineException – исключение создать самостоятельно, с конструктором String
    //4.4 В месте вызова метода обработать исключение, в catch вывести сообщение о исключительной
    //ситуации со строкой, которая к нему привела
    //4.5 Вывести информацию о людях
    //4.6 Найти самого старшего человека
    public static void main(String[] args) {
        final String DELIMETER = File.separator;
        final String INPUTFILE = "src"+ DELIMETER + "tasks28dz" + DELIMETER + "data" + DELIMETER + "inFourTask.txt";
       // String regex = "(\\w+);(\\d{2}\\.\\d{2}\\.\\d{4});(\\d+)";
        LocalDate date1 = LocalDate.of(1997,07,07);
        Worker worker = new Worker("Slava",date1,5000);
        worker.getWorkers();
        worker.readerFail(INPUTFILE);
        worker.getWorkers();
                //«Andry;12.08.2000;550»
        //«Vitia;30.10.1987;1500»
        //«Grisha;14.01.2002;780»
        //«Petia;05.02.1997;900»



    }
}
