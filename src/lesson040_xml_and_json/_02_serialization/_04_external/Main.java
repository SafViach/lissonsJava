package _02_serialization._04_external;

import java.io.*;

public class Main {
    public static final String FILE = "src/_02_serialization/_04_external/save.save";
    public static void main(String[] args) {
        var test = new ExtClass("Vasia", "Pupkin", "Thi$PaSS!");
        try (var oos = new ObjectOutputStream(new FileOutputStream(FILE));
            var ois = new ObjectInputStream(new FileInputStream(FILE))){
            System.out.println(test);
            oos.writeObject(test);
            System.out.println("________________________");
            var fromFile = (ExtClass)ois.readObject();
            System.out.println(fromFile);

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}
