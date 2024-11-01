package lesson040_xml_and_json._01_annotations._06_inherited;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var parentAnnotations = Parent.class.getAnnotations();
        var childAnnotations = Child.class.getAnnotations();
        System.out.println("Parent annotation size " + parentAnnotations.length);
        Arrays.stream(parentAnnotations)
                .forEach(System.out::println);
        System.out.println("Child annotation size " + childAnnotations.length);
        Arrays.stream(childAnnotations)
                .forEach(System.out::println);
    }
}
