package lesson023.task5.model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersonReaderWriter {
    public static List<Person> loadFromFile(String file){
        List <Person> list = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String fileLine = null;
            while((fileLine = br.readLine())!=null){//Student Masha 18 6.9
                String[] fields = fileLine.trim().split(" ");//[Student, Masha ,18, 6.9]
                String className = fields[0];
                String name = fields[1];
                int age = Integer.valueOf(fields[2]);
                switch (className){
                    case "Student":
                        double point = Double.valueOf(fields[3]);
                        list.add(new Student(name,age,point));
                        break;
                    case "Worker":
                        double salary = Double.valueOf(fields[3]);
                        list.add(new Worker(name,age,salary));
                        break;
                }
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return list;
    }

    public static void saveToFile(List<Person> personList , String file){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
            for (Person person : personList) {
                bw.write(person.toFileLine()+"\n");
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
