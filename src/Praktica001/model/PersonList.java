package Praktica001.model;

import java.util.ArrayList;
import java.util.List;

public class PersonList {
    private List<Person> list = new ArrayList<>();

    public void add(Person person){
        list.add(person);
    }
    public void print (){
        System.out.println("Person:");
        for (Person person : list) {
            System.out.println(person);
        }
    }
}
