import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.doS(null);
    }
    public void doS(Object obj){
        System.out.println(1);
    }public void doS(List list){
        System.out.println(2);
    }public void doS(ArrayList list){
        System.out.println(3);
    }

}
