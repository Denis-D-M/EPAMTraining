import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleGenericList<T> implements GenericCollection<T>{
    List<T> list = new ArrayList<>();

    @Override
    public T getElem(int index) {
        return list.get(index);
    }

    @Override
    public void add(T elem) {
        list.add(elem);
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
    public void printAll(){
        Iterator<T> iterator = list.iterator();
        while(iterator.hasNext()){
            T t = iterator.next();
            System.out.println(t);
        }
    }
    public static <T> Iterable<T> nCopies(T value, int count){
        if (count < 0){
            throw new IllegalArgumentException("Negative count - " + count);
        }
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    int rest = count;
                    @Override
                    public boolean hasNext() {
                        return false;
                    }

                    @Override
                    public T next() {
                        return null;
                    }
                };
            }
        };
    }
//    public void printAll(){
//        Iterator<T> iterator = list.iterator();
//        while(iterator.hasNext()){
//            T t = iterator.next();
//            System.out.println(t);
//        }
//    }
}

