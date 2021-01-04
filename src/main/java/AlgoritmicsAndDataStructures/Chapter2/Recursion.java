package AlgoritmicsAndDataStructures.Chapter2;

public class Recursion {
    public static void main(String[] args) {
        greet("Denis");
    }

    static void recursionDef(int i) {
        System.out.println(i);
        if (i == 0) {
            return;
        }
        recursionDef(i - 1);
    }

    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
        greet2(name);
        System.out.println("getting ready to say bye");
        bye();
    }
    static void greet2(String name){
        System.out.println("how are you, " + name + "?");
    }
    static void bye(){
        System.out.println("ok, bye!");
    }
}
