package lesson026.task5.model;

import lesson019.model.Person;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.attribute.AclEntryType;
import java.util.*;

public class StudentsUtil {

    public static List<Student> loadFromFile(String fileName) {
        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String fileLine = null;
            while ((fileLine = br.readLine()) != null) {//"Ivan Ivanov;FAIS;3;8 5 7 3"

                students.add(fileLineToStudent(fileLine));

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return students;
    }

    //метод который из линии файла должен создать объект Студента
    public static Student fileLineToStudent(String fileLine){

        String[] arrFileLine = fileLine.trim().split(";");//"Ivan Ivanov" "FAIS" "3" "8 5 7 3"

        String fullName = arrFileLine[0];//берем полное имя
        String[] names = fullName.split(" ");//разбиваем на массив из имени и фамилии
        String name = names[0];
        String surname = names[1];

        Faculty faculty = Faculty.valueOf(arrFileLine[1]);//преобразуем строку в элемент
        // перечисления

        int course = Integer.valueOf(arrFileLine[2]);//превращаем строку в число

        String[] strPoints = arrFileLine[3].split(" ");//"8" "5" "7" "3"
        //получаем массив отметок
        // но пока в виде строк
        List<Integer> points = new ArrayList<>();//сюда запишем считанные отметки
        for (String strPoint : strPoints) {
            points.add(Integer.valueOf(strPoint));
        }
        Student student = new Student(name, surname, faculty, course, points);
        return student;
    }

    static public void sortListStudent(List<Student> students){
        Collections.sort(students);
    }

    public static List<Student> excelentStudents (List<Student> students){
        List<Student> excelentStudents = new ArrayList<>();
        Iterator <Student> iterator= students.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if (student.avgPoint()>=8){
                excelentStudents.add(student);
            }
        }
        return excelentStudents;
    }
    public static List<Student> goodStudents (List<Student>students){
        List<Student> goodStudents = new ArrayList<>();
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if (student.avgPoint()<8 && student.avgPoint()>=6){
                goodStudents.add(student);
            }
        }
        return goodStudents;
    }
    static public List<Student> ordinalStudents(List<Student>students){
        List<Student> ordinalStudents = new ArrayList<>();
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            if (student.avgPoint()<6){
                ordinalStudents.add(student);
            }
        }
        return ordinalStudents;
    }
    static public Faculty coolFacultyPoAvgPoint(List<Student> students){
        Faculty coolFaculty = null;
        Map<Faculty,Double> map = resultAvgPointFaculty(students);
        Iterator <Map.Entry<Faculty , Double >> iterator = map.entrySet().iterator();
        Map.Entry<Faculty,Double> elem = iterator.next();
        for (Map.Entry<Faculty, Double> facultyDoubleEntry : map.entrySet()) {
            if (facultyDoubleEntry.getValue() > elem.getValue()){
                coolFaculty = facultyDoubleEntry.getKey();
            }
        }
        return coolFaculty;
    }

    static private Map<Faculty,Double> resultAvgPointFaculty( List<Student> students){
        Map<Faculty,List<Double>> map = distributeFacultyAndPoint(students);
        Map<Faculty,Double> resultAvgPointFaculty = new HashMap<>();

        for (Map.Entry<Faculty, List<Double>> facultyListEntry : map.entrySet()) {
            double avgPoint =0;
            for (Double aDouble : facultyListEntry.getValue()) {
                avgPoint +=  aDouble ;
            }
            resultAvgPointFaculty.put(facultyListEntry.getKey(),avgPoint/facultyListEntry.getValue().size());

        }
        return resultAvgPointFaculty;
    }

    static  private Map<Faculty,List<Double>> distributeFacultyAndPoint(List<Student> students){

        Map<Faculty,List<Double>> mapFacultyAndPoints = new HashMap<>();

        for (Student student : students) {
            if (mapFacultyAndPoints.get(student.getFaculty())==null){
                mapFacultyAndPoints.put(student.getFaculty(),student.returnListAvgPoint(student));
            }else{
                mapFacultyAndPoints.get(student.getFaculty()).add(student.avgPoint());
            }
        }
        return mapFacultyAndPoints;
    }

    public static void analysisStudents(List<Student> students){
        Iterator <Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student account = iterator.next();
            if (account.avgPoint()>=4){
                if (account.getCourse()==5){
                    iterator.remove();
                }
                account.setCourse(account.getCourse()+1);

            }
        }
        for (Student student : students) {
            System.out.println(student);
        }


    }
}

