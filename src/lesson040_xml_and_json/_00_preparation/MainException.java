package lesson040_xml_and_json._00_preparation;

import java.util.Scanner;

public class MainException {
    public static void main(String[] args) {
        System.out.println("Please, enter only numbers...");
        try (var sc = new Scanner(System.in)){
            while (sc.hasNextLine()) {
                try {
                    System.out.println(parseInt(sc.nextLine()));
                } catch (IllegalStateException e) {
                    System.err.println(e.getMessage());
                }
            }
        }
    }

    private static int parseInt(String str) throws IllegalStateException{
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new IllegalStateException("Idiot, only numbers!!! You entered " + str);
        }
    }
}
