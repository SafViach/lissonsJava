package lesson040_xml_and_json._02_serialization._01_base;

import java.io.*;
import java.util.stream.Collectors;

public class Main {
    public static final String INPUT = "src/_02_serialization/_01_base/in.file";
    public static final String OUTPUT = "src/_02_serialization/_01_base/out.txt";

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(INPUT));
             FileOutputStream os = new FileOutputStream(OUTPUT)) {
            os.write(br.lines().collect(Collectors.joining("\n")).getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
