package lesson035_practic;

import lesson035_practic.model.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //Genus animal = Genus.of("dog");
        // Валидатор - проверяльщик formats (regex);
        //List<Cat> catList = new ArrayList<>();
        var cats = new ArrayList<Cat>();
        var dogs = new ArrayList<Dog>();
        var errors = new HashMap<String, String>();

        AnimalUtils.parseFile(cats, dogs, errors);
//
//        AnimalUtils.printResults(cats , dogs , errors);
        var sortedCats = AnimalUtils.sortByBirthDate(cats);
        var sortedDog = AnimalUtils.sortByBirthDate(dogs);

        var youngCats = AnimalUtils.filterAnimals(sortedCats,true);
        var oldCats =AnimalUtils.filterAnimals(sortedCats,false);
        var youngDogs = AnimalUtils.filterAnimals(sortedDog,true);
        var oldDogs = AnimalUtils.filterAnimals(sortedDog,false);
        AnimalUtils.printResults(youngCats , youngDogs , oldCats , oldDogs);
    }
}
