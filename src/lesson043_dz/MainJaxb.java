package lesson043_dz;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import lesson043_dz.model.Cat;
import lesson043_dz.model.CatUtilsJaxb;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MainJaxb {
    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        var cats = CatUtilsJaxb.readFile();
       CatUtilsJaxb.printFile(cats);
       //тест
        var cat = new Cat("1244345","Kiska",5,"M");
        var context = JAXBContext.newInstance(Cat.class);

        var marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
        marshaller.marshal(cat,new File("src/lesson043_dz/data/output-test.xml"));

        var unmarshaller = context.createUnmarshaller();
        Cat myCat = (Cat) unmarshaller.unmarshal(new FileReader("src/lesson043_dz/data/output-test.xml"));
        System.out.println(myCat);
    }
}
