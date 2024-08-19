package lesson023.task3;

import lesson023.task3.model.Person;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        final String INPUT = "src/lesson023/task3/data/input.txt";
        //File.separator - универсальный разделитель каталогов
        final String OUTPUT = "src"+File.separator+"lesson023"+File.separator+"task3"+File.separator+"data"+File.separator+"output.txt";
        Person person = null;

        try(BufferedReader br = new BufferedReader(new FileReader(INPUT))){
            String fileLine = br.readLine().trim();//"Grisha 42 510.32" и убрали пробелы в начале и конце
            String[] firlds = fileLine.split(" ");//["Grisha","42","510.32"]
            person = new Person(firlds[0],Integer.valueOf(firlds[1]),Double.valueOf(firlds[2]));
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        //Person.plusSalary(person);
        System.out.println(person);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT))){
           // bw.write(person.toString());
           // bw.write(person.getName()+" "+person.getSalary()+" "+person.getAge());
            bw.write(person.toFileLine());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        System.out.println(person);
    }
}
