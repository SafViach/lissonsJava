package lesson040_xml_and_json._01_annotations._05_documented;

public class Tester {
    @TestDocumented(doTestDocument = "Hello doc with annotation")
    public void doDocumented() {}

    @TestNotDocumented(doTestNotDocument = "Hello doc without annotation")
    public void doNotDocumented() {}
}
