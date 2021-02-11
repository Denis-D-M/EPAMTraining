package Java8;

import java.util.ArrayList;
import java.util.List;

public class Human {
    List<Cat> list = new ArrayList<>();

    @Override
    public String toString() {
        return "Human{" +
                "list=" + list +
                '}';
    }
}
