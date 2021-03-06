package AlgoritmicsAndDataStructures.Chapter2;

public class HighArray {
    private long[] a; // Ссылка на массив a
    private int nElems; // Количество элементов в массиве
    //-----------------------------------------------------------
    public HighArray(int max) // Конструктор
    {
        a = new long[max]; // Создание массива
        nElems = 0; // Пока нет ни одного элемента
    }
    //-----------------------------------------------------------
    public boolean find(long searchKey)
    { // Поиск заданного значения
        int j;
        for(j=0; j<nElems; j++) // Для каждого элемента
            if(a[j] == searchKey) // Значение найдено?
                break; // Да - выход из цикла
        if(j == nElems) // Достигнут последний элемент?
            return false; // Да
        else
            return true; // Нет
    }
    //-----------------------------------------------------------
    public void insert(long value) // Вставка элемента в массив
    {
        a[nElems] = value; // Собственно вставка
        nElems++; // Увеличение размера
    }
    //-----------------------------------------------------------
    public boolean delete(long value)
    {
        int j;
        for(j=0; j<nElems; j++) // Поиск заданного значения
            if( value == a[j] )
                break;
        if(j==nElems) // Найти не удалось
            return false;
        else // Значение найдено
        {
            for(int k=j; k<nElems; k++) // Сдвиг последующих элементов
                a[k] = a[k+1];
            nElems--; // Уменьшение размера
            return true;
        }
    }
    public long removeMax(){
        if (nElems == 0){
            return -1;
        }
        long max = 0;
        int index = 0;
        for (int i = 0; i < nElems; i++) {
            if (a[i] > max) {
                max = a[i];
                index = i;
            }
        }
        for (int i = index; i < nElems; i++) {
            a[i] = a[i+1];
        }
        nElems--;
        return max;
    }
    //-----------------------------------------------------------
    public void display() // Вывод содержимого массива
    {
        for(int j=0; j<nElems; j++) // Для каждого элемента
            System.out.print(a[j] + " "); // Вывод
        System.out.println("");
    }
    //-----------------------------------------------------------
} // Конец класса HighArray
////////////////////////////////////////////////////////////////

