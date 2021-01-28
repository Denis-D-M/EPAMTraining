package Serializable;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        //Запись
//        FileOutputStream fileOutputStream = new FileOutputStream("text.txt");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//        Cat cat = new Cat();
//        objectOutputStream.writeObject(cat);
//        objectOutputStream.close();

        //Чтение
        FileInputStream fileInputStream = new FileInputStream("text.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Cat cat = (Cat) objectInputStream.readObject();
        System.out.println(cat);
        objectInputStream.close();

    }
}
