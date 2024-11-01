package lesson035_practic.model;

import java.time.LocalDate;

public class Dog extends Animal{
    public Dog(long chipNumber, Genus genus, String name, LocalDate birthDate, String breed, String email) {
        super(chipNumber, genus, name, birthDate, breed, email);
    }
}
