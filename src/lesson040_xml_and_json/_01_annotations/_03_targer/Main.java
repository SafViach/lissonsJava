package lesson040_xml_and_json._01_annotations._03_targer;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException {
        var classObj = FileInfoDemo.class;
        readAnnotation(classObj);
        var method = classObj.getMethod("print");
        readAnnotation(method);
    }

    @SuppressWarnings("unchecked")
    static void readAnnotation(AnnotatedElement element) {
        try {
            System.out.println("\nFind annotation in : " + element.getClass().getName());
            var annotations = element.getAnnotations();
            for (Annotation annotation : annotations) {
                if(annotation instanceof JavaFileInfo fileInfo) {
                    System.out.println("Author : " + fileInfo.name());
                    System.out.println("Version : " + fileInfo.value());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
