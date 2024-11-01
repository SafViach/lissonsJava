package lesson040_xml_and_json._02_serialization._03_standard_composition;

import java.io.Serializable;
import java.util.StringJoiner;

public class Cat implements Serializable {
    public static final long serialVersionUID = 25L;
    static String staticField = "static";
    final String name;
    Box box;

    public Cat(String name, Box box) {
        this.name = name;
        this.box = box;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Cat.class.getSimpleName() + "[", "]")
                .add("static='" + staticField + "'")
                .add("name='" + name + "'")
                .add("box=" + box)
                .toString();
    }
}
