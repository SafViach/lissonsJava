package lesson043_dz.model;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class CatUtilsJaxb {
    public static List<Cat> readFile() throws JAXBException, FileNotFoundException {
        var jaxbContext = JAXBContext.newInstance(CatAggregator.class).createUnmarshaller();
        var aggregator = (CatAggregator)jaxbContext.unmarshal(new FileReader("src/lesson043_dz/data/input-xml.xml"));
        return aggregator.getCats();
    }
    public static void printFile(List<Cat>cats){
        cats.forEach(System.out::println);
    }
}
