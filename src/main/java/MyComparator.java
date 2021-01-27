import java.util.Comparator;

public class MyComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.age - o2.age;
    }
}
