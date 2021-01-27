public class Dot implements Cloneable {
    int x;
    int y;
    A a;

    void someDotMethod(){

    }

    @Override
    public Dot clone() throws CloneNotSupportedException {
        Dot dot = (Dot) super.clone();
        dot.a = a.clone();
        return dot;
    }
}

