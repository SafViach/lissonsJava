package lesson040_xml_and_json._01_annotations._02_parameters;

import java.lang.annotation.*;

@Target(value = ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface MyAnnotation {
    String name() default "";
    int value();
}
