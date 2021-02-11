package Annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Main main = new Main();
        Person person = new Person();
        main.print(person, person.getClass());
    }
    void print(Object o, Class c) throws IllegalAccessException {
         Field[] fields = c.getDeclaredFields();
         for (Field f : fields){
             Annotation[] annotations = f.getDeclaredAnnotations();
             for (Annotation a : annotations){
                 if (a.annotationType().equals(Show.class)){
                     System.out.println(f.get(o));
                 }
             }
         }
    }
}
