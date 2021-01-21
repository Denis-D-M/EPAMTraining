import java.util.List;

public class GenericClass<T> {
    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public <U, Z> Z sout(U e){
        System.out.println(e);
        return (Z) e;
    }
    public void method(List<? extends Number> numberList){

    }



}
