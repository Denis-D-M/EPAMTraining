public class Dot implements Cloneable {
    int x;
    int y;
    A a;

    @Override
    public Dot clone() throws CloneNotSupportedException {
        Dot dot = (Dot) super.clone();
        dot.a = a.clone();
        return dot;
    }
}

