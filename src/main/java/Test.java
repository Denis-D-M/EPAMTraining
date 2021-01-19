import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    Logger logger = Logger.getLogger(Test.class.getName());

    public static void main(String[] args) throws CloneNotSupportedException {
        Test test = new Test();
//        Dot dot = new Dot();
//        dot.x = 1;
//        dot.y = 2;
//        dot.a = new A();
//        dot.a.z = 10;
//        Dot dot2 = (Dot) dot.clone();
//        System.out.println(dot2.x);
//        System.out.println(dot2.y);
//        System.out.println(dot2.a.z);
        SimpleGenericList<Integer> simpleGenericList = new SimpleGenericList<>();
        System.out.println(simpleGenericList.method(23.2, 213));
//        simpleGenericList.foo(new ArrayList<Integer>());
        List<Cat> cats = new ArrayList<>();
//        doS(cats);
        test.someExceptionable();
    }

    public static void doS(List<Animal> animalList) {
        System.out.println("something");
    }

    public void someExceptionable() {
        try {
            throw new Exception();
        } catch (Exception exception) {
            logger.log(Level.WARNING, "Ай-яй-яй!");
        }
    }
}
