package Annotation;

import java.lang.reflect.Field;

public class B {
    public static void main(String[] args) throws IllegalAccessException {
        A a1 = new A();
        a1.str = "A1str";
        a1.str2 = "A1str2";
        Field[] fields = a1.getClass().getDeclaredFields();
        for (Field field : fields){
            if (field.getDeclaredAnnotation(Printable.class).skiped()){
                System.out.println(field.get(a1));
            };
        }
    }
}
