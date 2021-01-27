import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainClass {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("S");
        set.add("g");
        set.add("g");
//        MyComparator<Cat> catMyComparator = new MyComparator<>();
//        MyComparator<Dog> dogMyComparator = new MyComparator<>();
//        catMyComparator.compare(new Cat(), new Cat());
//        dogMyComparator.compare(new Dog(), new Dog());
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
            System.out.println(iterator.hasNext());
        }

    }

}
