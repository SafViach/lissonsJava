package lesson040_xml_and_json._03_xml._04_jaxb.model;

import jakarta.xml.bind.annotation.XmlAttribute;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class JaxbCat {
    @XmlAttribute
    private int number;
    private String name;
    private int age;
}
