package StreamAPI;


import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        One one = new One();
        doSomething(one);
        doSomething(() -> {
            System.out.println(2);
        });
    }
    public static void doSomething(Runnable runnable){
        runnable.run();
    }


}
class One implements Runnable {
    @Override
    public void run() {
        System.out.println(3);
    }
}