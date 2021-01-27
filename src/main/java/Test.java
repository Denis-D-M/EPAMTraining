import java.awt.*;
import java.io.FileReader;
import java.util.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    static Logger logger;

    static {
        logger = Logger.getLogger(Test.class.getName());
        System.out.println("123");

    }

    public static void main(String[] args) throws CloneNotSupportedException {
//        Test test = new Test();
////        Dot dot = new Dot();
////        dot.x = 1;
////        dot.y = 2;
////        dot.a = new A();
////        dot.a.z = 10;
////        Dot dot2 = dot.clone();
////        System.out.println("dot" + " " + dot.x);
////        System.out.println("dot 2" + " " + dot2.x);
////        System.out.println("dot" + " " + dot.y);
////        System.out.println("dot 2" + " " + dot2.y);
////        System.out.println("dot" + " " + dot.a.z);
////        System.out.println("dot 2" + " " + dot2.a.z);
////        dot2.x = 228;
////        dot2.y = 229;
////        dot2.a.z = 116;
////        System.out.println("После изменения dot 2");
////        System.out.println("dot" + " " + dot.x);
////        System.out.println("dot 2" + " " + dot2.x);
////        System.out.println("dot" + " " + dot.y);
////        System.out.println("dot 2" + " " + dot2.y);
////        System.out.println("dot" + " " + dot.a.z);
////        System.out.println("dot 2" + " " + dot2.a.z);
////        System.out.println("И ещё раз dot.a");
////        System.out.println("dot" + " " + dot.a.z);
//        SimpleGenericList<String> simpleGenericListtt = new SimpleGenericList<>();
////        System.out.println(simpleGenericList.method(23.2, 213));
////        simpleGenericList.foo(new ArrayList<Integer>());
//        simpleGenericListtt.method(2.3D, 2);
//       List<Cat> cats = new ArrayList<>();
////
////        doS(cats);
////        test.someExceptionable();
//        GenericCollection<Cat> simpleGenericList = new SimpleGenericList<>();
//        simpleGenericList.add(new Cat());
//        simpleGenericList.add(new Cat());
//        simpleGenericList.add(new Cat());
//        simpleGenericList.add(new Cat());
//        simpleGenericList.add(new Cat());
//        simpleGenericList.add(new Cat());
//        simpleGenericList.printAll();
//        Person person = new Person("s", " s");
//        person.displayPerson();
//        B b = new B();
//        A a = new A();
//        A.V v = new A.V();
//        List list = new ArrayList();
        Queue<String> queue = new LinkedList<>() {
            {
                this.add("asd");
            }
        };
        queue.add("dasdasd");
        queue.add("asds");
        queue.add("asd");
        System.out.println(queue);
        List<Person> list = new ArrayList<>();
        list.add(new Person("Denis", "1"));
        list.add(new Person("Anton", "2"));
        list.add(new Person("Nikita", "3"));
        list.add(new Person("Aleksei", "4"));
//        Queue<Person> queue1 = new LinkedList<>();
//        Queue<Person> queue2 = new PriorityQueue<>();
//        queue2.add(new Person("Samuel", "asd"));
//        queue2.add(new Person("Samuel", "asd"));
//        queue2.add(new Person("Samuel", "asd"));
//        queue2.add(new Person("Samuel", "asd"));
//        queue2.add(new Person("Samuel", "asd"));
        System.out.println(list);
        ListIterator<Person> iterator = list.listIterator();
        while (iterator.hasNext()){
            Person p = iterator.next();
            p = null;
        }
        System.out.println(list);

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

    static public int exc() throws MyException {
        try (FileReader reader = new FileReader("")) {
            throw new MyException("1");
        } catch (Exception e) {
            throw new MyException("2");
        }
    }
}

