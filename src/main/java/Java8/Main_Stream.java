package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main_Stream {
    public static void main(String[] args) throws InterruptedException, ClassNotFoundException {
        List<Human> list = new ArrayList<>();
        Human h1 = new Human();
        Human h2 = new Human();
        Human h3 = new Human();
        Human h4 = new Human();
        Human h5 = new Human();
        list.add(h1);
        list.add(h2);
        list.add(h3);
        list.add(h4);
        list.add(h5);
        h1.list.add(new Cat());
        h1.list.add(new Cat());
        h2.list.add(new Cat());
        h2.list.add(new Cat());
        h3.list.add(new Cat());
        h3.list.add(new Cat());
        h4.list.add(new Cat());
        h4.list.add(new Cat());
        h5.list.add(new Cat());
        h5.list.add(new Cat());
        // Для примера поменять map на flatMap
        list.stream()
                .flatMap(s -> s.list.stream())
                .forEach(System.out::println);

    }

    public static void method() {
        System.out.println("Something2");
    }
}