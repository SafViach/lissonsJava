package lesson043_dz;

import lesson043_dz.model.Cat;
import lombok.Getter;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class SaxHandler extends DefaultHandler {
    @Getter
    private List<Cat> cats;
    private Cat cat;
    private String tagName;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("cats")){
            cats = new ArrayList<>();
        }else if(qName.equals("cat")){
            cat = new Cat();
        }
        tagName = qName;
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equals("cat")){
            cats.add(cat);
            cat=null;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        var value = new String(ch,start,length).trim();
            if (!value.isEmpty()) {
             switch (tagName) {
             case "id" -> cat.setId(value);
             case "name" -> cat.setName(value);
             case "age" -> cat.setAge(Integer.parseInt(value));
             case "gender" -> cat.setGender(value);
          }
          tagName = null;
        }
    }
}
