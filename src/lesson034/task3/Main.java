package lesson034.task3;

import lesson034.task3.model.EmpUtils;
import lesson034.task3.model.Employee;
import lesson034.task3.model.Position;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = EmpUtils.readEmployees("src/task3/data/in.txt");
        employees.forEach(System.out::println);

        /*3.2 Определить сколько человек работает в каждой компании
        3.3 Определить сколько человек соответствует каждой должности
        3.4 Сгруппировать работников по должностям
        3.5 Сгруппировать работников по компаниям
        3.6 Сгруппировать фамилии людей по компаниям
        3.7 Найти зарплатный фонд каждой компании
        3.8 Найти среднюю зп по должностям
        3.9 Найти среднюю зп по должностям в каждой компании*/

        Map<String, Long> map1 = employees.stream()
                .collect(Collectors.groupingBy(emp->emp.getCompany(), Collectors.counting()));
        map1.entrySet().forEach(System.out::println);
        System.out.println("----------------------");
        //3.4

        Map<Position, List<Employee>> map2 = employees.stream()
                .collect(Collectors.groupingBy(emp->emp.getPosition(), Collectors.toList()));
        map2.entrySet().forEach(entry -> {
            System.out.println(entry.getKey()+": ");
            entry.getValue().forEach(System.out::println);
        });

        System.out.println("------------------------");

        Map<String, List<String>> map3 = employees.stream()
                .collect(Collectors.groupingBy(emp->emp.getCompany(), //ключ
                        Collectors.mapping(emp->emp.getName(), Collectors.toList())));//значение имя в список

        map3.entrySet().forEach(System.out::println);

    }
}
