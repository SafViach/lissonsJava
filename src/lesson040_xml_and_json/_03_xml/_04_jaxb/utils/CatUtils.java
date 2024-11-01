package lesson040_xml_and_json._03_xml._04_jaxb.utils;

import lesson040_xml_and_json._03_xml._04_jaxb.model.CatAggregator;
import lesson040_xml_and_json._03_xml._04_jaxb.model.JaxbCat;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import lombok.SneakyThrows;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

public class CatUtils {
    public static final String INPUT = "src/_03_xml/_04_jaxb/input.xml";
    public static final String OUTPUT = "src/_03_xml/_04_jaxb/output.xml";

    @SneakyThrows
    public static List<JaxbCat> readFile() {
        var jaxbContext = JAXBContext.newInstance(CatAggregator.class);
        var unmarshaller = jaxbContext.createUnmarshaller();
        var aggregator = (CatAggregator) unmarshaller.unmarshal(new FileReader(INPUT));
        return aggregator.getCats();
    }

    @SneakyThrows
    public static void writeFile(List<JaxbCat> cats) {
        var aggregator = new CatAggregator(cats);
        var jaxbContext = JAXBContext.newInstance(CatAggregator.class);
        var marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(aggregator, new FileWriter(OUTPUT));
    }

    public static void print(List<JaxbCat> cats) {
        cats.forEach(System.out::println);
    }
}
