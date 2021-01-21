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
//        Dot dot2 = dot.clone();
//        System.out.println("dot" + " " + dot.x);
//        System.out.println("dot 2" + " " + dot2.x);
//        System.out.println("dot" + " " + dot.y);
//        System.out.println("dot 2" + " " + dot2.y);
//        System.out.println("dot" + " " + dot.a.z);
//        System.out.println("dot 2" + " " + dot2.a.z);
//        dot2.x = 228;
//        dot2.y = 229;
//        dot2.a.z = 116;
//        System.out.println("После изменения dot 2");
//        System.out.println("dot" + " " + dot.x);
//        System.out.println("dot 2" + " " + dot2.x);
//        System.out.println("dot" + " " + dot.y);
//        System.out.println("dot 2" + " " + dot2.y);
//        System.out.println("dot" + " " + dot.a.z);
//        System.out.println("dot 2" + " " + dot2.a.z);
//        System.out.println("И ещё раз dot.a");
//        System.out.println("dot" + " " + dot.a.z);
        SimpleGenericList<String> simpleGenericListtt = new SimpleGenericList<>();
//        System.out.println(simpleGenericList.method(23.2, 213));
//        simpleGenericList.foo(new ArrayList<Integer>());
        simpleGenericListtt.method(2.3D, 2);
       List<Cat> cats = new ArrayList<>();
//
//        doS(cats);
//        test.someExceptionable();
        GenericCollection<Cat> simpleGenericList = new SimpleGenericList<>();
        simpleGenericList.add(new Cat());
        simpleGenericList.add(new Cat());
        simpleGenericList.add(new Cat());
        simpleGenericList.add(new Cat());
        simpleGenericList.add(new Cat());
        simpleGenericList.add(new Cat());
        simpleGenericList.printAll();


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
