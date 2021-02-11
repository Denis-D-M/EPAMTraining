package Java8;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test{
    public static void main(String[] args) {
        Date date = new Date();

        LocalDate localDate = LocalDate.now();


        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.setAge(5);
        cat2.setAge(6);

        cat1.setName("Alice");
        cat2.setName("Pushka");

        List<String> names = Stream.of(cat1, cat2)
                .parallel()
                .sorted(Comparator.comparingInt(Cat::getAge))
                .map(Cat::getName)
                .collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}
