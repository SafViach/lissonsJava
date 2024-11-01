package lesson040_xml_and_json._02_serialization._03_standard_composition;

import java.io.Serializable;
import java.util.List;
import java.util.StringJoiner;

public class Box implements Serializable {
    List<String> things;

    public Box(List<String> things) {
        this.things = things;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Box.class.getSimpleName() + "[", "]")
                .add("things=" + things)
                .toString();
    }
}
