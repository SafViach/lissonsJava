package lesson040_xml_and_json._01_annotations._03_targer;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface JavaFileInfo {
    String name() default "Vasia Pupkin";
    String value() default "0.0";
}
