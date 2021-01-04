package AlgoritmicsAndDataStructures.Chapter2;

class OrdArray {
    private long[] a; // Ссылка на массив a
    private int nElems; // Количество элементов данных
    //-----------------------------------------------------------
    public OrdArray(int max) // Конструктор
    {
        a = new long[max]; // Создание массива
        nElems = 0;
    }
    //-----------------------------------------------------------
    public int size()
    { return nElems; }
    //-----------------------------------------------------------
    public int find(long searchKey)
    {
        int lowerBound = 0;
        int upperBound = nElems-1;
        int curIn;
        while(true)
        {
            curIn = (lowerBound + upperBound ) / 2;
            if(a[curIn]==searchKey)
                return curIn; // Элемент найден
            else if(lowerBound > upperBound)
                return nElems; // Элемент не найден
            else // Деление диапазона
            {
                if(a[curIn] < searchKey)
                    lowerBound = curIn + 1; // В верхней половине
                else
                    upperBound = curIn - 1; // В нижней половине
            }
        }
    }
    //-----------------------------------------------------------
    public void insert(long value) // Вставка элемента в массив
    {
        int j;
        int lowerBound = 0;
        int upperBound = nElems-1;
        int curIn;
        while(true)
        {
            curIn = (lowerBound + upperBound ) / 2;
            if(curIn == 0 || a[curIn] > a[curIn - 1] && a[curIn] < a[curIn + 1]) {
                j = curIn;
                break;
            }
            else if(lowerBound > upperBound) {
                j = curIn;
                break;
            }
            else // Деление диапазона
            {
                if(a[curIn] < value)
                    lowerBound = curIn + 1; // В верхней половине
                else
                    upperBound = curIn - 1; // В нижней половине
            }
        }
        for(int k=j; k<nElems - 1; k++) // Перемещение последующих элементов
            a[k] = a[k+1];
        a[j] = value; // Вставка
        nElems++; // Увеличение размера
    }
    //-----------------------------------------------------------
    public boolean delete(long value)
    {
        int j = find(value);
        if(j==nElems) // Найти не удалось
            return false;
        else // Элемент найден
        {
            for(int k=j; k<nElems; k++) // Перемещение последующих элементов
                a[k] = a[k+1];
            nElems--; // Уменьшение размера
            return true;
        }
    }
    //-----------------------------------------------------------
    public void display() // Вывод содержимого массива
    {
        for(int j=0; j<nElems; j++) // Перебор всех элементов
            System.out.print(a[j] + " "); // Вывод текущего элемента
        System.out.println("");
    }
    //-----------------------------------------------------------
}
////////////////////////////////////////////////////////////////