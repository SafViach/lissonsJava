package lesson040_xml_and_json._02_serialization._03_standard_composition;

import java.io.*;
import java.util.List;

public class Main {
    public static final String FILE = "src/_02_serialization/_03_standard_composition/save.save";

    public static void main(String[] args) {
        var vaska = new Cat("Vaska", new Box(List.of("Thing 1", "Thing 2")));

        try (var oos = new ObjectOutputStream(new FileOutputStream(FILE));
             var ois = new ObjectInputStream(new FileInputStream(FILE))){
            oos.writeObject(vaska);
            System.out.println(vaska);
            Cat.staticField = "new value";
            var catFromFile = (Cat) ois.readObject();
            System.out.println(catFromFile);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
