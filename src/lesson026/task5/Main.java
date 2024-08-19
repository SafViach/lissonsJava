package lesson026.task5;

import lesson026.task5.model.Faculty;
import lesson026.task5.model.Student;
import lesson026.task5.model.StudentsUtil;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//В файле хранится информация о студентах, их специальности, текущем курсе и
//отметкам по сессии. Так как специальности и курсы у студентов могут быть
//различными, то количество отметок за сессию также может быть различным.
//-Считать информацию из файла и организовать хранение объектов класса.
//-Отсортировать список студентов по двум критериям: в первую очередь по
//факультету, при одинаковых факультетах по среднему баллу.
//-Получить отдельно списки отличников (средний балл 8 и выше), хорошистов(6 и
//выше) и обычных студентов (до 6).
//-Определить на каком факультете учатся лучше всего.
//-Проанализировать средний балл каждого студента и перевести их на следующий
//курс, если их средний балл больше либо равен 4, иначе оставить на второй год.
//Если студент уже находился на последнем пятом курсе и его закончил, то удалить
//его из списка.
//Пример файла:
//Ivan Ivanov;FAIS;3;8 5 7 3
//Ignat Naumenko;EF;5;8 3 6 9 6
//Irina Vumnaya;EF;1;9 8 10 9
//Viktor Neznaev;GEF;3;3 6 2 3 1
//Petr Petrov;FAIS;5;1 9 5 3 9
//Maria Lentyaeva;GEF;5;6 5 8 4

public class Main {
    public static void main(String[] args) {
        final String EXCELLENT_STUDENTS = "Отличники";
        final String GOOD_STUDENTS ="Хорошисты";
        final String ORDINAL_STUDENTS ="Обычные";

        final String DELIMETER = File.separator;
        final String INPUT_FILE = "src" +DELIMETER+"lesson026"+ DELIMETER + "task5" + DELIMETER +
                                                    "data" + DELIMETER + "students.txt";

        List<Student> studentList = StudentsUtil.loadFromFile(INPUT_FILE);

        System.out.println("-------------------result---------------------------------------------");
        Faculty coolFaculty = StudentsUtil.coolFacultyPoAvgPoint(studentList);
        System.out.println(coolFaculty);

        System.out.println("--------------------------exit---------------------------------------");



        for (Student student : studentList) {
            System.out.println(student);
        }
        System.out.println("-------------сортировка------------------------------------------------------------------------");
        StudentsUtil.sortListStudent(studentList);
        for (Student student : studentList) {
            System.out.println(student);
        }
        System.out.println("-------------------------------------------------------------------------------------------------");

        System.out.println("-----------------------------категория студентов = Отличники");
        List<Student> exStudents = StudentsUtil.excelentStudents(studentList);
        for (Student student : exStudents) {
            System.out.println(student);
        }

       System.out.println("------------------------------категория студентов = Хорошисты");
        List<Student> goodStudents = StudentsUtil.goodStudents(studentList);
        for (Student goodStudent : goodStudents) {
            System.out.println(goodStudent);
        }

       System.out.println("----------------------------категория студентов = Обычные");
        List<Student> ordStudents = StudentsUtil.ordinalStudents(studentList);
        for (Student ordStudent : ordStudents) {
            System.out.println(ordStudent);
        }
        System.out.println("------------------------------------------результат анализа-----------------------------");
        StudentsUtil.analysisStudents(studentList);



    }
}
