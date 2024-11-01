package lesson040_xml_and_json._03_xml._01_csv.utils;

import lesson040_xml_and_json._03_xml._01_csv.model.CsvCat;
import lombok.experimental.UtilityClass;

import java.util.Arrays;

@UtilityClass
public class CatFactory {
    public static CsvCat getInstance(String str) throws IllegalStateException {
        var slitStr = str.split(",");
        validateArrayLength(slitStr.length);
        validateAsNumber(slitStr[0], slitStr[2]);
        var number = validateByNegative(Integer.parseInt(slitStr[0]));
        var name = validateByEmpty(slitStr[1]);
        var age = validateByNegative(Integer.parseInt(slitStr[2]));
        return new CsvCat(number, name, age);
    }

    private static void validateArrayLength(int length) {
        if(length != 3) {
            throw new IllegalStateException("Invalid line format");
        }
    }

    private static void validateAsNumber(String... strings) {
        try {
            Arrays.stream(strings).forEach(Integer::parseInt);
        } catch (NumberFormatException e) {
            throw new IllegalStateException("Number or age is not a number");
        }
    }

    private static int validateByNegative(int value) {
        if (value <= 0) {
            throw new IllegalStateException("Negative number or age");
        }
        return value;
    }

    private static String validateByEmpty(String value) {
        if (value.isEmpty()) {
            throw new IllegalStateException("Name is empty");
        }
        return value;
    }
}
