import java.util.ArrayList;
import java.util.List;

public class SimpleGenericList<T> implements GenericCollection<T>{
    List<T> list = new ArrayList<>();

    @Override
    public T getElem(int index) {
        return list.get(index);
    }

    @Override
    public void setElemTo(int index, T elem) {
        list.add(index, elem);
    }

    @Override
    public void deleteElem(int index) {
        list.remove(index);
    }
    public <S extends Number> S method(S e1, S e2){
        return e1;
    }
    public <U> void foo(List<U> list){
        list.set(0, list.get(0));
    }
}
