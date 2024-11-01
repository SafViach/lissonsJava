package lesson040_xml_and_json._01_annotations._03_targer;

@JavaFileInfo("2.0")
public class FileInfoDemo {
    private String field;

    @JavaFileInfo(name = "Joshua Bloch", value = "1.0")
    public void print() {};
}
