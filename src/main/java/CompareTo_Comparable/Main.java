package CompareTo_Comparable;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Person> personTreeSet = new TreeSet<>();
        personTreeSet.add(new Person("A", 23));
        personTreeSet.add(new Person("B", 2));
        personTreeSet.add(new Person("D", 13));
        personTreeSet.add(new Person("C", 35));
        personTreeSet.add(new Person("H", 4));
        for (Person p : personTreeSet) {
            System.out.println(p);
        }
        System.out.println("-------------------------");
        Set<Person> nameSortedSet = new TreeSet<>(new PersonNameComparator());
        nameSortedSet.addAll(personTreeSet);
        for (Person p : nameSortedSet) {
            System.out.println(p);
        }
    }
}
