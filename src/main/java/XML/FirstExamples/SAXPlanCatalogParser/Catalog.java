package XML.FirstExamples.SAXPlanCatalogParser;


import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<Plant> plants = new ArrayList<>();

    @Override
    public String toString() {
        return "Catalog{" +
                "plants=" + plants +
                '}';
    }
    public void add(Plant plant){
        plants.add(plant);
    }
}
