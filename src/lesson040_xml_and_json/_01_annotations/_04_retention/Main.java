package lesson040_xml_and_json._01_annotations._04_retention;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var annotations = AnnotatedClass.class.getAnnotations();
        System.out.println("Runtime annotations size = " + annotations.length);
        Arrays.stream(annotations)
                .forEach(System.out::println);
    }
}
