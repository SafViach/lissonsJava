package lesson040_xml_and_json._00_preparation;

import java.lang.reflect.InvocationTargetException;

public class MainReflection {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        var testObj = new TestReflection();

        var field = TestReflection.class.getDeclaredField("someField");
        field.setAccessible(true);

        field.set(testObj, "Some value");
        System.out.println(field.get(testObj));

        var method = TestReflection.class.getDeclaredMethod("someMethod");
        method.setAccessible(true);
        method.invoke(testObj);

        String eeeeeeee = new String("qqq");
        var www = new String("eeeee");
    }
}
