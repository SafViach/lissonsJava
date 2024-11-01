package lesson040_xml_and_json._03_xml._04_json;

import lesson040_xml_and_json._03_xml._01_csv.model.CsvCat;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class Main {
    public static final Gson GSON = new Gson();
    private static Type TYPE = new TypeToken<List<CsvCat>>(){}.getType();

    public static void main(String[] args) throws IOException {
//        var cats = List.of(
//                new CsvCat(1, "Vaska", 4),
//                new CsvCat(2, "Murzik", 5),
//                new CsvCat(3, "Mashka", 7),
//                new CsvCat(4, "Mimra", 5)
//        );
//
//        var jsonString = GSON.toJson(cats);
//        var fw = new FileWriter("src/_03_xml/_04_json/cats.json");
//        fw.write(jsonString);
//        fw.flush();

        List<CsvCat> catFromFile = GSON.fromJson(new FileReader("src/_03_xml/_04_json/cats.json"), TYPE);
        catFromFile.forEach(System.out::println);
    }
}
