public class A implements Cloneable {
    int z;

    @Override
    protected A clone() throws CloneNotSupportedException {
        return (A) super.clone();
    }
}
