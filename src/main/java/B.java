public class B extends A{
    static {
        System.out.println("Static block B");
    }
    {
        System.out.println("Non static block B");
    }
    public B() {
        super();
        System.out.println("Constructor B");
    }

}
