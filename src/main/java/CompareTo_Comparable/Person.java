package CompareTo_Comparable;

public class Person implements Comparable<Person> {
    String name;
    int age;
    private final long serialVersionUID = 1345345435L;

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
