public class A implements Cloneable {
    int z;
    public V v;

    static {
        System.out.println("Static block A");
    }
    {
        System.out.println("Non static block A");
    }

    public A() {
        System.out.println("Constructor A");
        v = new V();
    }
    static public class V{
        public void someMethod(){
            System.out.println("123");
        }

    }

    @Override
    protected A clone() throws CloneNotSupportedException {
        return (A) super.clone();
    }
}
class D {
    public void doS(){

    }
}
