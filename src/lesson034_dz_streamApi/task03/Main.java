package lesson034_dz_streamApi.task03;

import lesson034_dz_streamApi.task03.model.EmplUtils;
import lesson034_dz_streamApi.task03.model.Employee;
import lesson034_dz_streamApi.task03.model.Position;

import java.io.File;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Создать класс Employee (имя, наименование компании, должность зп)
        //3.1 Считать информацию о работниках из файла и записать объекты в коллекцию
        //3.2 Определить сколько человек работает в каждой компании
        //3.3 Определить сколько человек соответствует каждой должности
        //3.4 Сгруппировать работников по должностям
        //3.5 Сгруппировать работников по компаниям
        //3.6 Сгруппировать фамилии людей по компаниям
        //3.7 Найти зарплатный фонд каждой компании
        //3.8 Найти среднюю зп по должностям
        //3.9 Найти среднюю зп по должностям в каждой компании

        System.out.println("3.1 Считать информацию о работниках из файла и записать объекты в коллекцию");
        final String DELIMETER = File.separator;
        final String INPUT = "src" + DELIMETER + "lesson034_dz_streamApi"
                + DELIMETER + "task03" + DELIMETER + "data" + DELIMETER + "in.txt";
        List<Employee> employees = EmplUtils.readFail(INPUT);
        employees.forEach(System.out::println);

        System.out.println("3.2 Определить сколько человек работает в каждой компании");
        Map<String,Long> map = EmplUtils.colPeopleWorkInCompany(employees);
        map.entrySet().forEach(System.out::println);

        System.out.println("3.3 Определить сколько человек соответствует каждой должности");
        Map<Position , Long> map1 = EmplUtils.colPeopleWorkImPosition(employees);
        map1.entrySet().forEach(System.out::println);

        System.out.println("3.4 Сгруппировать работников по должностям");
        Map<Position,List<Employee>> groupMap1 =EmplUtils.groupWorkersByPosition(employees);
        groupMap1.entrySet().forEach(employee ->{
            System.out.println(employee.getKey()+ ": ");
            employee.getValue().forEach(System.out::println);
        });

        System.out.println("3.5 Сгруппировать работников по компаниям");
        Map<String , List<Employee>> groupMan2 = EmplUtils.groupWorkersByCompany(employees);
        groupMan2.entrySet().forEach(employee ->{
            System.out.println(employee.getKey()+ ": ");
            employee.getValue().forEach(System.out::println);
        });

        System.out.println("3.6 Сгруппировать фамилии людей по компаниям");
        Map<String,List<String>> groupMap3 = EmplUtils.groupWorksByByNameAndCompany(employees);
        groupMap3.entrySet().forEach(System.out::println);

        System.out.println("3.7 Найти зарплатный фонд каждой компании");
        Map<String , Double> groupMap4 = EmplUtils.calcFondCompany(employees);
        groupMap4.entrySet().forEach(System.out::println);

        System.out.println("3.8 Найти среднюю зп по должностям");
        DecimalFormat df = new DecimalFormat("#.##");
        Map<String , Double> groupMap5 = EmplUtils.calcAvgFondCompany(employees);
        groupMap5.entrySet().forEach(employee-> {
            System.out.print(employee.getKey() + ": ");
            System.out.println(df.format(employee.getValue()));
        });

        System.out.println("3.9 Найти среднюю зп по должностям в каждой компании");
        Map<String , Map<Position , Double>> groupMap6 = EmplUtils.calcAvgSalaryByCompanyByCompany(employees);
        groupMap6.entrySet().forEach(employee-> {
            System.out.println(employee.getKey() + " : (ключ 1-ой мапы) ");
            employee.getValue().entrySet().forEach(empl ->{
                System.out.print(empl.getKey()+ " : (ключ 2-ой мапы) ");
                System.out.println(empl.getValue());
            });
        });

    }
}
