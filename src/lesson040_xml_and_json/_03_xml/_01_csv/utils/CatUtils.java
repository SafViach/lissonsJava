package lesson040_xml_and_json._03_xml._01_csv.utils;

import lesson040_xml_and_json._03_xml._01_csv.model.CsvCat;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CatUtils {

    public static List<CsvCat> extractFromFle() {
        var cats = new ArrayList<CsvCat>();
        try (var sc = new Scanner(new FileReader("src/_03_xml/_01_csv/cats.csv"))){
            while (sc.hasNextLine()) {
                var line = sc.nextLine();
                try {
                    cats.add(CatFactory.getInstance(line));
                } catch (IllegalStateException e){
                    System.err.print(e.getMessage());
                    System.err.println(" in line " + line);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return cats;
    }

    public static void printCats(List<CsvCat> cats) {
        cats.forEach(System.out::println);
    }
}
