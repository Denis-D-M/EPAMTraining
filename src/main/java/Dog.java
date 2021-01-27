public class Dog extends Animal implements Comparable<Dog>{

    @Override
    public int compareTo(Dog o) {
        return this.age - o.age;
    }
}
