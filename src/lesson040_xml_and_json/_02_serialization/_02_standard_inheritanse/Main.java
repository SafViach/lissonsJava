package lesson040_xml_and_json._02_serialization._02_standard_inheritanse;

import java.io.*;

public class Main {
    public static final String PATH = "src/_02_serialization/_02_standard_inheritanse/save.save";
    public static void main(String[] args) {
        System.out.println("Creating...");
        var child = new Child(1);
        try (var os = new FileOutputStream(PATH);
            var oos = new ObjectOutputStream(os);
            var is = new FileInputStream(PATH);
            var ois = new ObjectInputStream(is)){
            System.out.println("Serializing...");
            oos.writeObject(child);
            System.out.println("Deserializing...");
            var childFromFile = (Child) ois.readObject();
            System.out.println(childFromFile);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
