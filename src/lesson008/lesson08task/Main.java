package lesson008.lesson08task;

import lesson008.lesson08task.model.Emploee;
import lesson008.lesson08task.model.Person;
import lesson008.lesson08task.model.Student;

public class Main {
    public static void main(String[] args) {

        Person[] people = {
                new Student("Misha", 8, 200),
                new Emploee("Grisha", 500)
        };

        for (Person person : people) {
            System.out.println(person);
        }

        double avgIncome = 0;
        for (Person person : people) {
            avgIncome = avgIncome + person.monthlyIncome();
        }
        avgIncome = avgIncome / people.length;

        avgIncome = 0;
        for (Person person : people) {
            if(person instanceof Student){
                avgIncome = avgIncome + person.monthlyIncome();
                //counter++;
            }

        }



    }
}
