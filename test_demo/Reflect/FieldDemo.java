package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class FieldDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<Student> c=Student.class;
        Constructor<?> con=c.getConstructor();
        Object obj=con.newInstance();
        Field nameField=c.getDeclaredField("name");
        Field ageField=c.getDeclaredField("age");
        nameField.setAccessible(true);
        ageField.setAccessible(true);
        nameField.set(obj,"rzx");
        ageField.set(obj,12);
        System.out.println(obj);
    }
}
