package lesson043_dz;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import java.io.FileInputStream;
import java.io.IOException;

public class MainHandler {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        var factory = SAXParserFactory.newInstance();
        var parser = factory.newSAXParser();
        var handler = new SaxHandler();

        parser.parse(new FileInputStream("src/lesson043_dz/data/input-xml.xml"),handler);

        var cats = handler.getCats();
        cats.forEach(System.out::println);

    }
}
