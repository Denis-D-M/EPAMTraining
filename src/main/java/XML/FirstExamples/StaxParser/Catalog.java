package XML.FirstExamples.StaxParser;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private final List<Plant> list = new ArrayList<>();
    public void add(Plant plant){
        list.add(plant);
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "list=" + list +
                '}';
    }

    public List<Plant> getList() {
        return list;
    }
}
