package lesson040_xml_and_json._02_serialization._02_standard_inheritanse;

import java.io.Serializable;
import java.util.StringJoiner;

public class Child extends Parent implements Serializable {
    int childField;

    public Child(int childField) {
        System.out.println("child constructor");
        this.childField = childField;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Child.class.getSimpleName() + "[", "]")
                .add("childField=" + childField)
                .add("parentField=" + parentField)
                .toString();
    }
}
