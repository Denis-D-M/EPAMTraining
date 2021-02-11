package Java8;

public class AB implements A, B{
    @Override
    public void test() {
        A.super.test();
    }
}
