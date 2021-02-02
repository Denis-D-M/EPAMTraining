package JVM;

import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        WeakReference<Main> weakReference = new WeakReference<>(new Main());
        Main main = weakReference.get();
        Method method = main.getClass().getMethod("doS");
        method.invoke(main);
    }

    public void doS(){
        System.out.println("Invoked");
    }

}
