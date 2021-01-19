public interface GenericCollection<T> {
    T getElem(int index);
    void setElemTo(int index, T elem);
    void deleteElem(int index);
}
