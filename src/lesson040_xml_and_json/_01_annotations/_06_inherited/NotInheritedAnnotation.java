package lesson040_xml_and_json._01_annotations._06_inherited;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface NotInheritedAnnotation {
}
