package Java8;

@FunctionalInterface
public interface MyInterface {
    void doSomething();

    default void meow(){
        System.out.println("meow");
    }
    static void test(){
        System.out.println("test");
    }
}
