package lesson034_dz_streamApi.task03.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class EmplUtils {
    public static List<Employee> readFail(String file) {
        List<Employee> employees = null;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            employees = br.lines()//"Fedya Microsoft director 3000"
                    .map(lines -> lines.split(" "))                   //"Fedya" "Microsoft" "director" "3000"    String
                    .map(fields -> new Employee(
                            fields[0],                                      //"Fedya"
                            fields[1],                                      //"Microsoft"
                            Position.valueOf(fields[2].toUpperCase()),      //DIRECTOR
                            Double.valueOf(fields[3])                       //3000
                    )).collect(Collectors.toList());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return employees;
    }

    public static Map<String, Long> colPeopleWorkInCompany(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getNameCompany(), Collectors.counting()));
    }

    public static Map<Position, Long> colPeopleWorkImPosition(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getPosition(),
                        Collectors.counting()));
    }

    public static Map<Position, List<Employee>> groupWorkersByPosition(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getPosition(), Collectors.toList()));
    }

    public static Map<String, List<Employee>> groupWorkersByCompany(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getNameCompany(),
                        Collectors.toList()));
    }

    public static Map<String, List<String>> groupWorksByByNameAndCompany(List<Employee> employees){
        return employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getNameCompany(),
                        Collectors.mapping(employee -> employee.getName(),Collectors.toList())));
    }

    public static Map<String , Double> calcFondCompany(List<Employee>employees){
        return employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getNameCompany(),
                        Collectors.summingDouble(employee->employee.getSalary())));
            }

    public static Map<String , Double> calcAvgFondCompany(List<Employee> employees){
        return  employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getNameCompany
                        ,Collectors.averagingDouble(Employee::getSalary)));
    }

    public static Map<String ,Map<Position,Double>> calcAvgSalaryByCompanyByCompany(List<Employee> employees){
        return employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getNameCompany,
                Collectors.groupingBy(
                        Employee::getPosition,
                        Collectors.averagingDouble(Employee::getSalary))));
    }
}
