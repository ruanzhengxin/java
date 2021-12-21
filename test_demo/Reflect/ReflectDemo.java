package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Student s=new Student("rzx",21);
        Class<? extends Student> c=s.getClass();
        Constructor<?> con=c.getConstructor(String.class,int.class);
        Object obj=con.newInstance("rzx",1);
        System.out.println(obj);
    }
}
