package lesson037;

import lombok.val;

import java.lang.reflect.InvocationTargetException;

public class MainReflection {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        var testObj = new TestReflection();
        var field = TestReflection.class.getDeclaredField("someField");
        field.setAccessible(true);
        field.set(testObj , "Some value");
        System.out.println(field.get(testObj));

        var method = TestReflection.class.getDeclaredMethod("someMethod");
        method.setAccessible(true);

        method.invoke(testObj);


    }
}
