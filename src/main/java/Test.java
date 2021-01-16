
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Dot dot = new Dot();
        dot.x = 1;
        dot.y = 2;
        dot.a = new A();
        dot.a.z = 10;
        Dot dot2 = (Dot) dot.clone();
        System.out.println(dot2.x);
        System.out.println(dot2.y);
        System.out.println(dot2.a.z);

    }
}
