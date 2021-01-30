package Lection3_Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Human> mainList = new ArrayList<>();
        // 1 - Заполнить ArrayList этими объектами.
        mainList.add(new Human("Mishin Denis Dmitriievich", 20, "Togliatti", "Sanatornaya", (short) 10, (short) 2));
        mainList.add(new Human("Mishin Denis Dmitriievich", 20, "Togliatti", "Sanatornaya", (short) 10, (short) 2));
        mainList.add(new Human("Yudin Anton Borisovich", 20, "Togliatti", "40 let pobedy", (short) 45, (short) 15));
        mainList.add(new Human("Yudin Anton Borisovich", 20, "Togliatti", "40 let pobedy", (short) 45, (short) 15));
        mainList.add(new Human("Ermochenko Nikita Andreevich", 20, "Togliatti", "Lenina", (short) 11, (short) 4));
        mainList.add(new Human("Ermochenko Nikita Andreevich", 20, "Togliatti", "Lenina", (short) 11, (short) 4));
        mainList.add(new Human("Ivanov Dmitrii Ivanovich", 20, "Togliatti", "Mira", (short) 100, (short) 25));
        mainList.add(new Human("Petrov Petr Dmitrievich", 20, "Togliatti", "Sportivnaya", (short) 6, (short) 3));
        mainList.add(new Human("Sidorov Nikolay Michailovich", 20, "Togliatti", "Frynze", (short) 54, (short) 66));
        mainList.add(new Human("Mikhailov Nikita Igorevich ", 20, "Togliatti", "Revolutsionnaya", (short) 78, (short) 8));
        //2. Найти дубли в коллекции и вывести их в консоль.
        searchDoublets(mainList);
        //3. Удалить дубли из коллекции, должно остаться 7 объектов.
        deleteDoublets(mainList);
        // 4. Отсортировать людей по ФИО
        sortListByFullName(mainList);
        // 5. Отсортировать людей по возрасту
        sortListByAge(mainList);
        // 6. Отсортировать людей по адресу (лексикографическая сортировка полного адреса)
        sortListByAdress(mainList);


    }

    public static void sout(Iterable<? extends Human> collection) {
        for (Human h : collection) {
            System.out.println(h);
        }
    }

    //2. Найти дубли в коллекции и вывести их в консоль.
    public static void searchDoublets(List<Human> list) {
        List<Human> tmp = new ArrayList<>(list);
        for (Human h : new HashSet<>(list)) {
            tmp.remove(h);
        }
        sout(tmp);
        System.out.println("------");
    }

    //3. Удалить дубли из коллекции, должно остаться 7 объектов.
    public static void deleteDoublets(List<Human> list) {
        Set<Human> tmp = new HashSet<>(list);
        list.clear();
        list.addAll(tmp);
        sout(list);
        System.out.println("------");
    }

    // 4. Отсортировать людей по ФИО
    public static void sortListByFullName(List<Human> list) {
        list.sort(Comparator.comparing(Human::getFullName));
    }

    // 5. Отсортировать людей по возрасту
    public static void sortListByAge(List<Human> list) {
        list.sort(Comparator.comparing(Human::getAge));
    }

    // 6. Отсортировать людей по адресу (лексикографическая сортировка полного адреса)
    public static void sortListByAdress(List<Human> list) {
        list.sort((o1, o2) -> {
            Human.Adress o1Adress = o1.getAdress();
            Human.Adress o2Adress = o2.getAdress();
            String s1 = o1Adress.getCity() + o1Adress.getStreet() + o1Adress.getBuilding() + o1Adress.getApartment();
            String s2 = o2Adress.getCity() + o2Adress.getStreet() + o2Adress.getBuilding() + o2Adress.getApartment();
            return s1.compareTo(s2);
        });
    }




}
