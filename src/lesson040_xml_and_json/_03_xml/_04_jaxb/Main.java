package lesson040_xml_and_json._03_xml._04_jaxb;

import static lesson040_xml_and_json._03_xml._04_jaxb.utils.CatUtils.*;

public class Main {
    public static void main(String[] args) {
        var cats = readFile();

        print(cats);

        writeFile(cats);
    }
}
