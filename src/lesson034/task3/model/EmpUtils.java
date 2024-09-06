package lesson034.task3.model;

import lesson034.task2.model.Person;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class EmpUtils {
    public static List<Employee> readEmployees(String file){

        List<Employee> employees = null;

        try(BufferedReader br = new BufferedReader(new FileReader(file))){

            employees = br.lines()//поток всех строк файла
                    .map(line -> line.split(" "))
                    .map(fields -> new Employee(
                            fields[0],//имя
                            fields[1],//компания
                            Position.valueOf(fields[2].toUpperCase()),
                            Double.valueOf(fields[3])
                    )).collect(Collectors.toList());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  employees;
    }
}
