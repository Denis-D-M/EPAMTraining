package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.IntSupplier;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hi, I'm optional");
//        optional = Optional.empty();
        //Разница между Else и ElseGet!!!!
        optional.orElse("Nothing to sout");
        optional.orElseGet(() -> "Nothing to sout");
        //Ещё один пример
        optional.orElse("Nothing");
        optional.orElseGet(OptionalExample::getPersonName);
        System.out.println(getPersonName());
        List<OptionalInt> optionalIntList = new ArrayList<>();
        optionalIntList.add(OptionalInt.of(123));
        optionalIntList.add(OptionalInt.empty());
        optionalIntList.add(OptionalInt.of(13));
        optionalIntList.add(OptionalInt.empty());
        optionalIntList.add(OptionalInt.of(1213));
        optionalIntList.stream().filter(s -> s.orElse(1) < 10);

    }

    public static String getPersonName() {
        Optional<String> name = Optional.of(getName()).filter(s -> !s.isEmpty());
        return name.orElse("Empty name");
    }

    public static String getName() {
        return "Robert";
    }
}
