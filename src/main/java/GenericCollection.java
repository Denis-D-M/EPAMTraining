public interface GenericCollection<T> {
    T getElem(int index);
    void add(T elem);
    void setElemTo(int index, T elem);
    void deleteElem(int index);
    void printAll();
}
